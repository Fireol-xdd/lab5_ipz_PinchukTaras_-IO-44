package work5.task1;

public class Main1 {

    public static void main(String[] args) {
        System.out.println("--- 1. Створення ієрархічної структури комп'ютера ---");


        ComputerPart processor = new Processor();
        ComputerPart memory = new Memory();
        ComputerPart videoCard = new VideoCard();


        Computer internalSystem = new Computer();
        internalSystem.addPart(new Processor());
        internalSystem.addPart(new Memory());


        Computer mainComputer = new Computer();
        mainComputer.addPart(processor);
        mainComputer.addPart(memory);
        mainComputer.addPart(videoCard);
        mainComputer.addPart(internalSystem);

        System.out.println("\n--- 2. Застосування операції (Visitor 1: PowerCalculator) ---");


        PowerCalculatorVisitor powerVisitor = new PowerCalculatorVisitor();


        mainComputer.accept(powerVisitor);


        double totalPower = powerVisitor.getTotalPower();
        System.out.println("Результат : " + totalPower);


        System.out.println("\n--- 3. Додавання нового метода (Visitor 2: Display) ---");


        DisplayVisitor displayVisitor = new DisplayVisitor();


        mainComputer.accept(displayVisitor);
    }
}