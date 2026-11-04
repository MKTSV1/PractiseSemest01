package semestr1.practise09;

public class CompositeCircle {
    private double radius;
    private final Point2D center;
    public CompositeCircle(double centerX,double centerY, double radius){
        this.center = new Point2D(centerX,centerY);
        this.radius = Math.max(0.0, radius);
    }
    public boolean containsPoint(Point2D p){
        return center.distanceTo(p) <= radius;
    }
    @Override
    public String toString() {
        return String.format("Коло [центр=%s, радіус=%.2f]", center.toString(), radius);
    }
}
