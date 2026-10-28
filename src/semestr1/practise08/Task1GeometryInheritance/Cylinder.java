package semestr1.practise08.Task1GeometryInheritance;

public class Cylinder extends Circle{
    private double height;
    public Cylinder(double radius,double height) {
        super(radius);
        this.height = height;
        if (height <= 0) {
            System.out.println("Попередження! Висота не може бути менше або дорівнювати 0! Змінено на 1");
            this.height = 1;
        }
    }
    public double getVolume(){
        return super.getArea() * height;
    }
    public double getTotalSurfaceArea(){
        return 2 * super.getArea() + super.getCircumference() * height;
    }
    @Override public String toString(){
        return super.toString() + String.format(" Cylinder[height = %.2f, volume = %.2f, totalArea = %.2f]",height,getVolume(),getTotalSurfaceArea());
    }
}
