package semestr1.practise07;

public class DPoint2D04 {
    private double x;
    private double y;
    private double distanceToOrigin;
    private double targetX;
    private double targetY;
    private double distanceTo;
    public DPoint2D04(){
        this.x = 0;
        this.y = 0;
    }
    public DPoint2D04(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double distanceToOrigin(){
        distanceToOrigin = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        return distanceToOrigin;
    }
    public double distanceTo(double targetX, double targerY){
        this.targetX = targetX;
        this.targetY = targerY;
        distanceTo = Math.sqrt(Math.pow((targetX - x),2)+Math.pow((targerY - y),2));
        return distanceTo;
    }
    public void printPoint(){
        System.out.println("Початкова координата: (" + x + ";" + y + ")");
        System.out.println("Відстань від початку координат до точки " + Math.round(distanceToOrigin * 100.0) / 100.0);
        System.out.println("Відстань від точки:  + (" + x + ";" + y + ")" + " до точки " +
                "(" + targetX + ";" + targetY + ") = " + Math.round(distanceTo * 100.0) / 100.0);
    }
}
