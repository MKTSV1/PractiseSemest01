package semestr1.practise09.Task1CompositeShapesCanvas;

public class Rectangle2D extends AbstractShape2D{
    private double width;
    private double height;

    public Rectangle2D(String name, Point2D anchorPoint,double width,double height) {
        super(name, anchorPoint);
        this.width = Math.max(1,width);
        this.height= Math.max(1,height);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
    @Override
    public String toString() {
        return String.format("Rectangle2D[name='%s', center=%s, %.2fx%.2f | S=%.2f, P=%.2f]",
                getName(), getAnchorPoint(), width, height, getArea(), getPerimeter());
    }
}
