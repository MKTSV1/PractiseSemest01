package semestr1.practise08.Task3Vector3DHierarchy;

public class Vector2D {
    private double x;
    private double y;
    public Vector2D(double x,double y){
        this.x = x;
        this.y = y;
    }
    public Vector2D(){
        this(0.0,0.0);
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void setX(double otherX){
        x = otherX;
    }
    public void setY(double otherY){
        y = otherY;
    }
    public double getLength(){
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
    }
    public double dotProduct(Vector2D other){
        return x * other.getX() + y * other.getY();
    }

    @Override
    public String toString() {
        return String.format("Vector2D(%.2f;%.2f) |L|=%.2f",x,y,getLength());
    }
}
