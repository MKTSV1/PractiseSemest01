package semestr1.practise06;

public class Triangle {
    public double a;
    public double b;
    public double c;

    public boolean isValid() {
        return (a + b > c && a + c > b && b + c > a);
    }

    public double getPerimeter() {
        return  a + b + c;
    }

    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p -a) * (p -b) * (p - c));
    }
}
