package semestr1.practise08.Task1GeometryInheritance;

public class Circle {
    private double radius;
    public Circle(double radius){
        this.radius =radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
        if (radius <= 0){
            System.out.println("Попередження! Радіус менше або дорівнює 0! Встановлено Радіус = 1");
            this.radius = 1;
        }
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return  Math.PI * Math.pow(radius,2);
    }
    public double getCircumference(){
        return 2 * Math.PI * radius;
    }
    @Override public String toString(){
        return String.format("Circle[r=%.2f, S=%.2f, C=%.2f]",radius,getArea(),getCircumference());
    }
}
