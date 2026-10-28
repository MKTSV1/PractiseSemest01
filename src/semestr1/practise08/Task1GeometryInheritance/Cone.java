package semestr1.practise08.Task1GeometryInheritance;

public class Cone extends Circle{
    private double height;
    public Cone(double radius,double height){
        super(radius);
        this.height = height;
        if (height<=0){
            System.out.println("Попередження! Висота не може бути менше або дорівнювати 0! Змінено на 1");
        this.height = 1;
        }
    }
    public double getSlantHeight(){
        return  Math.sqrt(Math.pow(super.getRadius(),2) + Math.pow(height,2));
    }
    public double getVolume(){
        return 1/3.0 * super.getArea() * height;
    }
    public double getTotalSurfaceArea(){
        return super.getArea() + Math.PI * super.getRadius() * getSlantHeight();
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" Cone[height = %.2f, slantHeight = %.2f, " +
                "volume = %.2f, totalArea = %.2f]",height,
                getSlantHeight(),getVolume(),getTotalSurfaceArea());
    }
}
