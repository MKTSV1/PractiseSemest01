package semestr1.practise10.Task1PolymorphicShapesAndTransforms;

public class ImmutableReferenceSquare extends AbstractShape2D{
    private final double side;
    public ImmutableReferenceSquare(String name, double centerX, double centerY,double side) {
        super(name, centerX, centerY);
        this.side=side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }
    @Override
    public String toString() {
        return String.format("%s, side=%.2f | S=%.2f, P=%.2f, Q=%.4f]",
                super.toString(), side, getArea(), getPerimeter(), getIsoperimetricQuotient());
    }
}