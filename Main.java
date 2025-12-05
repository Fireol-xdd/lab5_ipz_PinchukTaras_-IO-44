package work5.task2;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- 1. Створення TCP-з'єднання у LISTENING ---");
        // Задаєм о початковий стан
        TCPConnection connection = new TCPConnection(new ListeningState());

        System.out.println("\n--- Спроба надсилання даних у LISTENING ---");
        connection.send("Hello Server!");
        connection.receive();

        System.out.println("\n--- 2. Перехід в ESTABLISHED---");
        // У стані LISTENING метод open() імітує прийняття клієнта
        connection.open();

        System.out.println("\n--- Робота в стані ESTABLISHED ---");
        connection.send("HTTP/1.1 200 OK");
        connection.receive();
        connection.open();

        System.out.println("\n--- 3. Закриття з'єднання---");
        connection.close();

        System.out.println("\n--- Спроба роботи в стані CLOSED ---");
        connection.send("Ping");
        connection.receive();
        connection.close();

        System.out.println("\n--- Повторне відкриття ---");
        connection.open();
    }
}