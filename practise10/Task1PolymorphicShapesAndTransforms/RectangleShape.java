package semestr1.practise10.Task1PolymorphicShapesAndTransforms;

public class RectangleShape extends AbstractShape2D implements  Scalable2D,Rotatable2D{
    private double width;
    private double height;
    private double rotationAngle;

    public RectangleShape(String name, double centerX, double centerY,double width, double height, double rotationAngle) {
        super(name, centerX, centerY);
        this.width=width;
        this.height=height;
        this.rotationAngle=rotationAngle;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double getPerimeter() {
        return 2* (height+width);
    }

    @Override
    public void scale(double factor) {
    double actualFactor = Math.max(factor, Scalable2D.MIN_SCALE_FACTOR);
    height = height * factor;
    width = width * factor;
    }

    @Override
    public void rotate(double deltaDegrees) {
        rotationAngle = (rotationAngle + deltaDegrees) % 360.0;
        if (rotationAngle < 0) {
            rotationAngle += 360.0;
        }
    }

    @Override
    public double getRotationAngle() {
        return rotationAngle;
    }
    @Override
    public String toString() {
        return String.format("%s, %.2fx%.2f, angle=%.1f° | S=%.2f, P=%.2f, Q=%.4f]",
                super.toString(), width, height, rotationAngle, getArea(), getPerimeter(), getIsoperimetricQuotient());
    }
}
