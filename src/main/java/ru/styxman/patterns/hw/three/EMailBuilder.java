package ru.styxman.patterns.hw.three;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * EMailBuilder.
 */
public class EMailBuilder {

    public IFromBuilder subject(String subject) {
        return new FromBuilder(subject);
    }

    private class FromBuilder implements IFromBuilder {
        private String subject;
        private String sender;

        public FromBuilder(String subject) {
            this.subject = subject;
            this.sender = "Denis";
        }

        @Override
        public IFromBuilder from(String sender) {
            this.sender = sender;
            return this;
        }

        @Override
        public ICopyToBuilder to(String addressee) {
            return new CopyToBuilder(subject, sender, addressee);
        }

        @Override
        public ICopyToBuilder toAll(String... addressee) {
            return new CopyToBuilder(subject, sender, addressee);
        }
    }

    private class CopyToBuilder implements ICopyToBuilder {
        private String subject;
        private String sender;
        private Set<String> directAddressees = new HashSet<>();
        private Set<String> copyAddressees = new HashSet<>();

        public CopyToBuilder(String subject, String sender, String addressee) {
            this.subject = subject;
            this.sender = sender;
            this.directAddressees.add(addressee);
        }

        public CopyToBuilder(String subject, String sender, String... addressees) {
            this.subject = subject;
            this.sender = sender;
            this.directAddressees.addAll(Arrays.asList(addressees));
        }

        @Override
        public IContentBuilder copyTo(String copyAddressee) {
            return new ContentBuilder(subject, sender, directAddressees, copyAddressee);
        }

        @Override
        public IContentBuilder copyToAll(String... copyAddressees) {
            return new ContentBuilder(subject, sender, directAddressees, copyAddressees);
        }

        @Override
        public ICopyToBuilder to(String addressee) {
            this.directAddressees.add(addressee);
            return this;
        }

        @Override
        public ICopyToBuilder toAll(String... addressees) {
            this.directAddressees.addAll(Arrays.asList(addressees));
            return this;
        }
    }

    private class ContentBuilder implements IContentBuilder {
        private String subject;
        private String sender;
        private Set<String> directAddressees = new HashSet<>();
        private Set<String> copyAddressees = new HashSet<>();

        public ContentBuilder(String subject, String sender, String directAddressees) {
            this.subject = subject;
            this.sender = sender;
            this.directAddressees.add(directAddressees);
        }

        public ContentBuilder(String subject, String sender, Set<String> directAddressees, String copyAddressees) {
            this.subject = subject;
            this.sender = sender;
            this.directAddressees = directAddressees;
            this.copyAddressees.add(copyAddressees);
        }

        public ContentBuilder(String subject, String sender, Set<String> directAddressees, String... copyAddressees) {
            this.subject = subject;
            this.sender = sender;
            this.directAddressees = directAddressees;
            this.copyAddressees.addAll(Arrays.asList(copyAddressees));
        }

        @Override
        public IContentBuilder copyTo(String addressee) {
            this.copyAddressees.add(addressee);
            return this;
        }

        @Override
        public IContentBuilder copyToAll(String... addressees) {
            this.copyAddressees.addAll(Arrays.asList(addressees));
            return this;
        }

        @Override
        public IFinalBuilder content(Content content) {
            return new FinalBuilder(subject, sender, directAddressees, copyAddressees, content);
        }
    }

    private class FinalBuilder implements IFinalBuilder {
        private String subject;
        private String sender;
        private Set<String> directAddressees;
        private Set<String> copyAddressees;
        private Content content;

        public FinalBuilder(String subject, String sender, Set<String> directAddressees, Set<String> copyAddressees, Content content) {
            this.subject = subject;
            this.sender = sender;
            this.directAddressees = directAddressees;
            this.copyAddressees = copyAddressees;
            this.content = content;
        }

        @Override
        public EMail build() {
            EMail eMail = new EMail();
            eMail.setSubject(subject);
            eMail.setSender(sender);
            eMail.setDirectAddressees(directAddressees);
            eMail.setCopyAddressees(copyAddressees);
            eMail.setContent(content);
            return eMail;
        }
    }

    public interface IFromBuilder extends IToBuilder {
        IFromBuilder from(String sender);
    }

    public interface IToBuilder {
        ICopyToBuilder to(String addressee);

        ICopyToBuilder toAll(String... addressees);
    }

    public interface ICopyBuilder {
        IContentBuilder copyTo(String addressee);

        IContentBuilder copyToAll(String... addressees);
    }

    public interface ICopyToBuilder extends ICopyBuilder, IToBuilder {

    }

    public interface IContentBuilder extends ICopyBuilder {
        IFinalBuilder content(Content content);
    }

    public interface IFinalBuilder {
        EMail build();
    }
}
