package ru.styxman.patterns.hw.four;

/**
 * Message.
 */
public class Message {
    private String author;
    private String addressee;
    private String body;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAddressee() {
        return addressee;
    }

    public void setAddressee(String addressee) {
        this.addressee = addressee;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "\n" +
                "author = '" + author + '\'' +
                ",\naddressee = '" + addressee + '\'' +
                ",\nbody = '" + body + '\'' +
                "\n---";
    }
}
