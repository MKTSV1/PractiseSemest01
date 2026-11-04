package semestr1.practise09.Task1CompositeShapesCanvas;

public class Point2D {
    private double x;
    private double y;
    public Point2D(double x,double y){
        this.x = x;
        this.y = y;
    }
    public Point2D(Point2D other){
        if (other != null) {
            this.x = other.x;
            this.y = other.y;
        }
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public void translate(double dx, double dy){
    this.x += dx;
    this.y += dy;
    }
    public double distanceTo(Point2D other){
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));    }
    @Override public String toString(){
        return String.format("(%.2f;%.2f)",x,y);
    }
}
