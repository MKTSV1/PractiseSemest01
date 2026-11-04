package semestr1.practise10;

public class CircleShape extends Shape2D{
    private double radius;
    public CircleShape(double radius){
        this.radius =radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }
}
