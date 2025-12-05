package work5.task2;
/*
 *Клас, що оброблює стани зв'язку
 */
public class EstablishedState implements ConnectionState {

    @Override
    public void open(TCPConnection context) {
        System.out.println("ESTABLISHED: З'єднання вже встановлено.");
    }

    @Override
    public void close(TCPConnection context) {
        System.out.println("ESTABLISHED: Розриваємо з'єднання. Перехід в CLOSED.");
        context.setState(new ClosedState());
    }

    @Override
    public void send(TCPConnection context, String data) {
        System.out.println("ESTABLISHED: Надсилання даних -> '" + data + "'");
    }

    @Override
    public void receive(TCPConnection context) {
        System.out.println("ESTABLISHED: Отримання даних <- (дані отримано)");
    }
}