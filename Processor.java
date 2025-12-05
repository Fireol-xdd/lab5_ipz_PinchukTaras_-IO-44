package work5.task1;

// Впевніться, що є "implements ComputerPart"
public class Processor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}