package semestr1.practise08;

public class Circle {
    private double radius;
    public Circle(double radius){
        this.radius = radius;
        if (radius <=0.0){
            radius =1.0;
        }
    }
    public double setRadius(double radius){
        this.radius = radius;
        if (radius <= 0){
            this.radius = 1;
        }
        return radius;
    }
    public double getArea(){
        return Math.PI * radius;
    }
    public double getCircumference(){
        return 2 * Math.PI * radius;
    }
    @Override
    public String toString(){
        return String.format("Радіус = %.2f | Площа = %.2f | ??? = %.2f", radius,getArea(),getCircumference());
    }
}
