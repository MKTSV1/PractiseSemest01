package semestr1.practise09.Task1CompositeShapesCanvas;

public class RightTriangle2D extends AbstractShape2D{
    private double legA;
    private double legB;

    public RightTriangle2D(String name, Point2D anchorPoint, double a, double b) {
        super(name, anchorPoint);
        this.legB = Math.max(1,b);
        this.legA = Math.max(1,a);

    }
    public double getHypotenuse(){
        return Math.sqrt(Math.pow(legA,2)  + Math.pow(legB,2));
    }
    @Override
    public double getArea() {
        return 0.5 * legA * legB;
    }

    @Override
    public double getPerimeter() {
        return legA + legB + getHypotenuse();
    }
    @Override
    public String toString() {
        return String.format("RightTriangle2D[name='%s', center=%s, a=%.2f, b=%.2f, c=%.2f | S=%.2f, P=%.2f]",
                getName(), getAnchorPoint(), legA, legB, getHypotenuse(), getArea(), getPerimeter());
    }
}
