package semestr1.practise07;


public class FRectangle07 {
    private double width;
    private double height;
    public FRectangle07(){
    this.width = 1.0;
    this.height = 1.0;
    }
    public FRectangle07(double size){
        this.width = size;
        this.height = size;
    }
    public FRectangle07(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return width * height;
    }
    public double getPerimeter(){
        return width * 2 + height * 2;
    }
    public boolean isSquare(){
        return height == width;
    }
    public void printRectangle(){
        System.out.println("Ширина " + width + " Висота " + height);
        System.out.println("Площа " + getArea() + " Периметр " + getPerimeter());
        if (isSquare()){
            System.out.println("Це квадрат");
        }
    }
}
