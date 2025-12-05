package work5.task2;

public class ListeningState implements ConnectionState {

    @Override
    public void open(TCPConnection context) {
        System.out.println("LISTENING: Вхідне підключення прийнято. Перехід в ESTABLISHED.");
        context.setState(new EstablishedState());
    }

    @Override
    public void close(TCPConnection context) {
        System.out.println("LISTENING: Припиняємо слухати порт. Перехід в CLOSED.");
        context.setState(new ClosedState());
    }

    @Override
    public void send(TCPConnection context, String data) {
        System.out.println("LISTENING: Помилка. Немає активного з'єднання для надсилання даних (чекаємо клієнта).");
    }

    @Override
    public void receive(TCPConnection context) {
        System.out.println("LISTENING: Помилка. Немає активного з'єднання для отримання даних.");
    }
}