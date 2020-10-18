package ru.styxman.patterns.hw.four;

/**
 * ChatClientImpl.
 */
public class ChatClientImpl implements ChatClient {

    @Override
    public void sentMessage(Message message) {
        System.out.println("Message send: " + message);

    }

    @Override
    public void getMessage(Message message) {
        System.out.println("You've got a new Message: " + message);
    }
}
