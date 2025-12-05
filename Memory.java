package work5.task1;

/**
 * Клас Memory (ConcreteElement)
 * Представляє оперативну пам'ять.
 */
public class Memory implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}