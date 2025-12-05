package work5.task2;

/**
 * Клас, що представляє саме з'єднання, яке змінює свою поведінку
 */
public class TCPConnection {
    private ConnectionState state;

    // прийняття поточного стану
    public TCPConnection(ConnectionState initialState) {
        this.state = initialState;
    }

    // Метод для зміни стану
    public void setState(ConnectionState newState) {
        System.out.println(">>> Зміна стану: "
                + state.getClass().getSimpleName()
                + " -> " + newState.getClass().getSimpleName());
        this.state = newState;
    }

    // ді\ потчоного стану
    public void open() {
        state.open(this);
    }

    public void close() {
        state.close(this);
    }

    public void send(String data) {
        state.send(this, data);
    }

    public void receive() {
        state.receive(this);
    }
}