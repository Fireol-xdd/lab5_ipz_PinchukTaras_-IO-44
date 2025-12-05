package work5.task2;

/**
 * Інтерфейс ConnectionState (State)
 * Описує всі можливі дії над з'єднанням.
 */
public interface ConnectionState {
    void open(TCPConnection context);
    void close(TCPConnection context);
    void send(TCPConnection context, String data);
    void receive(TCPConnection context);
}