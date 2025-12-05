package work5.task1;

/**
 * Клас DisplayVisitor (ConcreteVisitor 2)
 * Реалізує нову операцію - "відображення" компонентів.
 * Додано без зміни існуючих класів компонентів.
 */
public class DisplayVisitor implements ComputerPartVisitor {

    private String indent = ""; // Для ілюстрації ієрархії

    @Override
    public void visit(Processor processor) {
        System.out.println(indent + "Відображення [Processor]");
    }

    @Override
    public void visit(Memory memory) {
        System.out.println(indent + "Відображення [Memory]");
    }

    @Override
    public void visit(VideoCard videoCard) {
        System.out.println(indent + "Відображення [VideoCard]");
    }

    @Override
    public void visit(Computer computer) {
        System.out.println(indent + "Відображення [Computer: Контейнер] {");

        // Логіка, пов'язана з функціонуванням шаблону (обхід ієрархії)
        String oldIndent = indent;
        indent += "  "; // Збільшуємо відступ для дочірніх елементів

        // (Рекурсивний обхід відбувається у Computer.accept(),
        // цей візит лише готує стан для дочірніх елементів)

        // Логіка для "закриття" контейнера (потрібно думати, як це зробити)
        // У нашій реалізації Computer.accept() сам обходить дітей,
        // тому ми не можемо тут "закрити" дужку.
        // Для простоти заглушки, ми просто показуємо вхід у контейнер.
        // Для коректного відображення ієрархії,
        // логіка обходу має бути у самому відвідувачі,
        // а Computer.accept() має надавати доступ до дітей.

        // Відкотимо відступ назад (хоча у цій реалізації це не спрацює ідеально)
        indent = oldIndent;
        // System.out.println(indent + "}"); // Не можемо зробити це тут
    }
}