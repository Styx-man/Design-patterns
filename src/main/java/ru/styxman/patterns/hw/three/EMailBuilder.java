package ru.styxman.patterns.hw.three;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * EMailBuilder.
 */
public class EMailBuilder {
    private String subject;
    private String sender = "Denis";
    private Set<String> directAddressees = new HashSet<>();
    private Set<String> copyAddressees = new HashSet<>();
    private Content content;

    boolean isSubjectFilled;
    boolean isAddresseeFilled;
    boolean isCopyAddresseeFilled;
    boolean isContentBodyFilled;
    boolean isContentFilled;

    public EMailBuilder newLetter() {
        return new EMailBuilder();
    }

    public EMailBuilder subject(String subject) {
        if (!isSubjectFilled) {
            this.subject = subject;
            isSubjectFilled = true;
            return this;
        } else {
            throw new RuntimeException("Subject have been already filled");
        }
    }

    public EMailBuilder from(String sender) {
        this.sender = sender;
        return this;
    }

    public EMailBuilder to(String addressee) {
        if (isSubjectFilled && !isCopyAddresseeFilled) {
            this.directAddressees.add(addressee);
            isAddresseeFilled = true;
            return this;
        } else {
            // Здесь и далее:
            // можно было бы увеличить вложенность if'ов для каждого из булианов,
            // чтобы кидать ошибку с текстом какого именно параметра не хватает или о неправильной последовательности заполнения,
            // но как по мне - это перебор
            throw new RuntimeException("Subject should be filled or wrong sequence");
        }
    }

    public EMailBuilder toAll(String... addressees) {
        if (isSubjectFilled && !isCopyAddresseeFilled) {
            this.directAddressees.addAll(Arrays.asList(addressees));
            isAddresseeFilled = true;
            return this;
        } else {
            throw new RuntimeException("Subject should be filled or wrong sequence");
        }
    }

    public EMailBuilder copyTo(String addressee) {
        if (isSubjectFilled && isAddresseeFilled && !isContentFilled) {
            this.copyAddressees.add(addressee);
            isCopyAddresseeFilled = true;
            return this;
        } else {
            throw new RuntimeException("Subject and/or addressee should be filled or wrong sequence");
        }
    }

    public EMailBuilder copyToAll(String... addressees) {
        if (isSubjectFilled && isAddresseeFilled && !isContentFilled) {
            this.copyAddressees.addAll(Arrays.asList(addressees));
            isCopyAddresseeFilled = true;
            return this;
        } else {
            throw new RuntimeException("Subject and/or addressee should be filled or wrong sequence");
        }
    }

    public EMailBuilder content(Content content) {
        if (isSubjectFilled && isAddresseeFilled) {
            if (!isContentFilled) {
                this.content = new Content();
                this.content.setBody(content.getBody());
                isContentBodyFilled = true;
                this.content.setSignature(content.getSignature());
                isContentFilled = true;
                return this;
            } else {
                throw new RuntimeException("Content have been already filled");
            }
        } else {
            throw new RuntimeException("Subject and/or addressees should be filled");
        }
    }

    public EMail build() {
        if (!(isSubjectFilled
                || isAddresseeFilled
                || isContentBodyFilled)) {
            throw new RuntimeException("Subject, addressee and body should be filled");
        } else {
            EMail eMail = new EMail();
            eMail.setSubject(this.subject);
            eMail.setSender(this.sender);
            eMail.setDirectAddressees(this.directAddressees);
            eMail.setCopyAddressees(this.copyAddressees);
            eMail.setContent(this.content);
            return eMail;
        }
    }
}
