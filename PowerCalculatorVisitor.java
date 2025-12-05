package work5.task1;

/**
 * Клас PowerCalculatorVisitor (ConcreteVisitor 1)
 * Реалізує операцію обчислення потужності.
 * Методи бізнес-логіки (visit) реалізовані як заглушки.
 */
public class PowerCalculatorVisitor implements ComputerPartVisitor {

    private double totalPower = 0;

    @Override
    public void visit(Processor processor) {
        // Заглушка, що імітує бізнес-логіку
        System.out.println("Розрахунок потужності для Processor.");
        // totalPower += 150; // Приклад реальної логіки
    }

    @Override
    public void visit(Memory memory) {
        // Заглушка, що імітує бізнес-логіку
        System.out.println("Розрахунок потужності для Memory.");
        // totalPower += 30; // Приклад реальної логіки
    }

    @Override
    public void visit(VideoCard videoCard) {
        // Заглушка, що імітує бізнес-логіку
        System.out.println("Розрахунок потужності для VideoCard.");
        // totalPower += 250; // Приклад реальної логіки
    }

    @Override
    public void visit(Computer computer) {
        // Заглушка, що імітує бізнес-логіку
        System.out.println("Обробка контейнера Computer.");
        // totalPower += 20; // Приклад реальної логіки
    }

    /**
     * Метод бізнес-логіки для отримання результату (також заглушка).
     */
    public double getTotalPower() {
        System.out.println("Повернення загальної потужності.");
        return totalPower; // Поверне 0, оскільки логіка - заглушка
    }
}