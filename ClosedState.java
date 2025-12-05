package work5.task2;

public class ClosedState implements ConnectionState {

    @Override
    public void open(TCPConnection context) {
        System.out.println("CLOSED: Відкриваємо з'єднання, переходимо в LISTENING...");
        context.setState(new ListeningState());
    }

    @Override
    public void close(TCPConnection context) {
        System.out.println("CLOSED: З'єднання вже закрите.");
    }

    @Override
    public void send(TCPConnection context, String data) {
        System.out.println("CLOSED: Помилка. Не можна надсилати дані через закрите з'єднання.");
    }

    @Override
    public void receive(TCPConnection context) {
        System.out.println("CLOSED: Помилка. Не можна отримувати дані через закрите з'єднання.");
    }
}