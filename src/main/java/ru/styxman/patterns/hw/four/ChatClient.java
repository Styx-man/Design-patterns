package ru.styxman.patterns.hw.four;

/**
 * ChatClient.
 */
public interface ChatClient {

    void sentMessage(Message message);

    void getMessage(Message message);
}
