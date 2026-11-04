package semestr1.practise09.Task1CompositeShapesCanvas;

public class Circle2D extends AbstractShape2D{
    private double radius;
    public Circle2D(String name, Point2D anchorPoint,double radius) {
        super(name, anchorPoint);
        this.radius = Math.max(1,radius);
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public String toString() {
        return String.format("Circle2D[name='%s', center=%s, r=%.2f | S=%.2f, P=%.2f]",
                getName(), getAnchorPoint(), radius, getArea(), getPerimeter());
    }
}
