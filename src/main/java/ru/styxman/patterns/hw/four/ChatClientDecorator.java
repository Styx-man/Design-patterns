package ru.styxman.patterns.hw.four;

/**
 * ChatClientDecorator.
 */
public abstract class ChatClientDecorator implements ChatClient {

    protected ChatClient chatClient;

    public ChatClientDecorator(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    @Override
    public void sentMessage(Message message) {
        chatClient.sentMessage(message);
    }

    @Override
    public void getMessage(Message message) {
        chatClient.getMessage(message);
    }
}
