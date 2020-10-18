package ru.styxman.patterns.hw.four;

import java.util.Base64;

/**
 * EncryptionDecorator.
 */
public class EncryptionDecorator extends ChatClientDecorator {

    public EncryptionDecorator(ChatClient chatClient) {
        super(chatClient);
    }

    @Override
    public void sentMessage(Message message) {
        System.out.println("Decoding message body...");
        message.setBody(decode(message.getBody()));
        super.sentMessage(message);
    }

    @Override
    public void getMessage(Message message) {
        System.out.println("Encoding message body...");
        message.setBody(encode(message.getBody()));
        super.getMessage(message);
    }

    private String encode(String s) {
        return new StringBuilder(s).deleteCharAt(0).reverse().toString();
    }

    private String decode(String s) {
        return new StringBuilder(s).append('d').reverse().toString();
    }
}
