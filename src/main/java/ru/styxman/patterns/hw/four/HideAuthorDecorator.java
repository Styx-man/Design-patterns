package ru.styxman.patterns.hw.four;

import java.util.Random;

/**
 * HideAuthorDecorator.
 */
public class HideAuthorDecorator extends ChatClientDecorator {

    public HideAuthorDecorator(ChatClient chatClient) {
        super(chatClient);
    }

    @Override
    public void sentMessage(Message message) {
        System.out.println("Hiding author name...");
        message.setAuthor(hideAuthor());
        super.sentMessage(message);
    }

    @Override
    public void getMessage(Message message) {
        super.getMessage(message);
    }

    private String hideAuthor() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();
        return random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}
