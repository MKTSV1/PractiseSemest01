package semestr1.practise09.Task1CompositeShapesCanvas;

import java.util.Arrays;

public class GeometryCanvas {
    private final String title;
    private final AbstractShape2D[] shapes;
    private int count;
    public GeometryCanvas(String title,int capacity){
        this.title=title;
        this.count= 0;
        this.shapes = new AbstractShape2D[capacity];
    }
    boolean addShape(AbstractShape2D shape){
        if (shape == null || count >= shapes.length) {
            return false;
        }
        shapes[count++] = shape;
        return true;
    }
    public double getTotalArea() {
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += shapes[i].getArea();
        }
        return sum;
    }
    public double getTotalPerimeter() {
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += shapes[i].getPerimeter();
        }
        return sum;
    }
    public AbstractShape2D findLargestShape() {
        if (count == 0) return null;
        AbstractShape2D largest = shapes[0];
        for (int i = 1; i < count; i++) {
            if (shapes[i].getArea() > largest.getArea()) {
                largest = shapes[i];
            }
        }
        return largest;
    }
    public void moveAllShapes(double dx, double dy) {
        for (int i = 0; i < count; i++) {
            shapes[i].moveBy(dx, dy);
        }
    }
    @Override
    public String toString() {
        String result = "Полотно: '" + title + "' (Фігур: " + count + "/" + shapes.length + ")\n";
        for (int i = 0; i < count; i++) {
            result += (i + 1) + ". " + shapes[i].toString() + "\n";
        }
        return result;
    }
}
