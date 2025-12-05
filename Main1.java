package work5.task1;

public class Main1 {

    public static void main(String[] args) {
        System.out.println("--- 1. Створення ієрархічної структури комп'ютера ---");

        // Створюємо окремі компоненти
        ComputerPart processor = new Processor();
        ComputerPart memory = new Memory();
        ComputerPart videoCard = new VideoCard();

        // Створюємо підсистему (вкладений комп'ютер/контейнер)
        Computer internalSystem = new Computer();
        internalSystem.addPart(new Processor()); // Допоміжний процесор
        internalSystem.addPart(new Memory());    // Допоміжна пам'ять

        // Створюємо головний комп'ютер (корінь дерева)
        Computer mainComputer = new Computer();
        mainComputer.addPart(processor);
        mainComputer.addPart(memory);
        mainComputer.addPart(videoCard);
        mainComputer.addPart(internalSystem); // Додаємо підсистему

        System.out.println("\n--- 2. Застосування операції (Visitor 1: PowerCalculator) ---");

        // Створюємо відвідувача для розрахунку потужності
        PowerCalculatorVisitor powerVisitor = new PowerCalculatorVisitor();

        // Запускаємо відвідувача на кореневому елементі
        // Він рекурсивно обійде ВСЮ структуру
        mainComputer.accept(powerVisitor);

        // Отримуємо результат (буде 0.0, оскільки метод - заглушка)
        double totalPower = powerVisitor.getTotalPower();
        System.out.println("Результат (із заглушки): " + totalPower);


        System.out.println("\n--- 3. Додавання нового метода (Visitor 2: Display) ---");

        // Створюємо нового відвідувача
        DisplayVisitor displayVisitor = new DisplayVisitor();

        // Запускаємо нового відвідувача на тій самій структурі
        mainComputer.accept(displayVisitor);
    }
}