package work5.task1;

/**
 * Клас VideoCard (ConcreteElement)
 * Представляє відеокарту.
 */
public class VideoCard implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}