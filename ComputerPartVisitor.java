package work5.task1;

/**
 * Інтерфейс ComputerPartVisitor (Visitor)
 * Оголошує набір методів visit() для кожного конкретного
 * компонента системи.
 */
public interface ComputerPartVisitor {
    void visit(Processor processor);
    void visit(Memory memory);
    void visit(VideoCard videoCard);
    void visit(Computer computer);
}