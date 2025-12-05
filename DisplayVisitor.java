package work5.task1;

/**
 * Клас DisplayVisitor (ConcreteVisitor 2)
 * Реалізує нову операцію - "відображення" компонентів.
 * Додано без зміни існуючих класів компонентів.
 */
public class DisplayVisitor implements ComputerPartVisitor {

    private String indent = "";

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


        String oldIndent = indent;

        indent = oldIndent;

    }
}