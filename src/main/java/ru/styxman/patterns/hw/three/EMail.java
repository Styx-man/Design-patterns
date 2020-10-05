package ru.styxman.patterns.hw.three;

import java.util.Set;

/**
 * EMail.
 */
public class EMail {
    private String subject;
    private String sender;
    private Set<String> directAddressees;
    private Set<String> copyAddressees;
    private Content content;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public Set<String> getDirectAddressees() {
        return directAddressees;
    }

    public void setDirectAddressees(Set<String> directAddressees) {
        this.directAddressees = directAddressees;
    }

    public Set<String> getCopyAddressees() {
        return copyAddressees;
    }

    public void setCopyAddressees(Set<String> copyAddressees) {
        this.copyAddressees = copyAddressees;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "EMail {\n" +
                "subject = " + subject + ",\n" +
                "sender = " + sender + ",\n" +
                "directAddressees = " + directAddressees + ",\n" +
                "copyAddressees = " + copyAddressees + ",\n" +
                "content {\n" +
                "body = " + content.getBody() + ",\n" +
                "signature = " + content.getSignature() + "\n" +
                "    }\n" +
                "}";
    }
}
