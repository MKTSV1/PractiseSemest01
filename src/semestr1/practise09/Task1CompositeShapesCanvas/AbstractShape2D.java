package semestr1.practise09.Task1CompositeShapesCanvas;

public abstract class AbstractShape2D {
    private final String name;
    private final Point2D anchorPoint;
    public AbstractShape2D(String name,Point2D anchorPoint){
        this.anchorPoint = (anchorPoint != null) ? new Point2D(anchorPoint) : new Point2D(0,0);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Point2D getAnchorPoint() {
        return new Point2D(anchorPoint);
    }
    public void moveBy(double dx, double dy){
        anchorPoint.translate(dx,dy);
    }
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return String.format("%s[name='%s', center=%s | S=%.2f, P=%.2f]",
                getClass().getSimpleName(), name, anchorPoint, getArea(), getPerimeter());
        }
}
