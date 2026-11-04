package semestr1.practise10;

public class EquilateralTriangleShape extends Shape2D{
    private int a;
    public EquilateralTriangleShape(int a){
        this.a =a;
    }
    @Override
    public double getPerimeter() {
        return 3 * a;
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * Math.pow(a,2);
    }
}
