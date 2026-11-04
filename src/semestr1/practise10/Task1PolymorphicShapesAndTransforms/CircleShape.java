package semestr1.practise10.Task1PolymorphicShapesAndTransforms;

public class CircleShape extends AbstractShape2D implements  Scalable2D{
    private double radius;

    public CircleShape(String name, double centerX, double centerY,double radius) {
        super(name, centerX, centerY);
        this.radius =Math.max(0.1,radius);
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void scale(double factor) {
        double actualFactor = Math.max(factor, Scalable2D.MIN_SCALE_FACTOR);
        radius *= actualFactor;
    }
    @Override
    public String toString() {
        return String.format("%s, r=%.2f | S=%.2f, P=%.2f, Q=%.4f]",
                super.toString(), radius, getArea(), getPerimeter(), getIsoperimetricQuotient());
    }
}