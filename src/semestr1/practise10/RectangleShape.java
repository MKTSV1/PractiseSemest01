package semestr1.practise10;

public class RectangleShape extends  Shape2D{
    private int a;
    private int b;
public RectangleShape(int a, int b){
    this.a = a;
    this.b = b;
}
    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return 2 * (a + b);
    }
}
