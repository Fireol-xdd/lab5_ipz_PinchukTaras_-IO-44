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

        System.out.println("Розрахунок потужності для Processor.");

    }

    @Override
    public void visit(Memory memory) {

        System.out.println("Розрахунок потужності для Memory.");

    }

    @Override
    public void visit(VideoCard videoCard) {

        System.out.println("Розрахунок потужності для VideoCard.");

    }

    @Override
    public void visit(Computer computer) {

        System.out.println("Обробка контейнера Computer.");

    }


    public double getTotalPower() {
        System.out.println("Повернення загальної потужності.");
        return totalPower; // Поверне 0, оскільки логіка - заглушка
    }
}