package semestr1.practise06.Task3;

public class Vector2D {
    private double x;
    private double y;
    private double otherX;
    private double otherY;
    public void set(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getLength(){
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
    }
    public double getOtherLength(){
        return Math.sqrt(Math.pow(otherX,2) + Math.pow(otherY,2));
    }
    public void multiplyByScalar(double k){
        x = x * k;
        y = y * k;
    }
    public void setOtherXY(double otherX, double otherY){
        this.otherX = otherX;
        this.otherY = otherY;
    }
    public double dotProduct(){
        return x * otherX + y * otherY;
    }
    public boolean isPerpendicularTo(){
        return (Math.abs(this.dotProduct()) < 1e-9);
    }
    public void normalize(){
    double length = getLength();
        if (getLength() > 0){
       x = x / length;
       y = y / length;
        }
    }
    public void printVector(){
        System.out.println("=== ВЕКТОРНИЙ АНАЛІЗАТОР (2D GEOMETRY) ===");
        System.out.println("Вектор A: (" + x + "; " + y + "), Довжина |A| = " + getLength());
        System.out.println("Вектор B: (" + otherX + "; " + otherY + "), Довжина |A| = " + getOtherLength());
        System.out.println("\nСкалярний добуток A · B: " + dotProduct());
        System.out.print("Чи є вектори перпендикулярними (кут 90°)? -> ");
        if (isPerpendicularTo()){
            System.out.print("ТАК (true)" + "\n");
        }else{
            System.out.print("Ні (false)" + "\n");
        }
        System.out.println("\nНормалізація вектора A...");
        normalize();
        getLength();
        System.out.println("Одиничний вектор A: (" + x + "; " + y + ")");
        System.out.println("Нова довжина вектора A: " + getLength());
        System.out.println("==========================================");
    }
}
