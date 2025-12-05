package work5.task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Клас Computer (Composite / ConcreteElement)
 * Представляє комп'ютер як контейнер для інших компонентів.
 */
public class Computer implements ComputerPart {

    // Список дочірніх компонентів (Composite pattern)
    private List<ComputerPart> parts = new ArrayList<>();

    public void addPart(ComputerPart part) {
        this.parts.add(part);
        System.out.println("Додано компонент: " + part.getClass().getSimpleName());
    }

    public void removePart(ComputerPart part) {
        this.parts.remove(part);
        System.out.println("Видалено компонент: " + part.getClass().getSimpleName());
    }

    @Override
    public void accept(ComputerPartVisitor visitor) {
        // 1. Спочатку відвідувач обробляє сам контейнер (Computer)
        visitor.visit(this);

        // 2. Потім контейнер просить кожного свого дочірнього
        //    елемента "прийняти" того ж самого відвідувача.
        // Це забезпечує рекурсивний обхід дерева.
        for (ComputerPart part : parts) {
            part.accept(visitor);
        }
    }
}