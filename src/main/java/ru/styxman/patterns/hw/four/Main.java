package ru.styxman.patterns.hw.four;

/**
 * Main.
 *
 * @author Denis_Lukashov
 */
public class Main {

    public static void main(String[] args) {

        Message message = new Message();
        message.setAuthor("Denis");
        message.setAddressee("Iliya");
        message.setBody("Yesterday all my troubles seemed so far away");

//        ChatClient chatClient = new ChatClientImpl();
//        ChatClient chatClient = new HideAuthorDecorator(new ChatClientImpl());
//        ChatClient chatClient = new EncryptionDecorator(new ChatClientImpl());
        ChatClient chatClient = new HideAuthorDecorator(new EncryptionDecorator(new ChatClientImpl()));

        chatClient.sentMessage(message);
        chatClient.getMessage(message);
    }
}
