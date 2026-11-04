package semestr1.practise10.Task1PolymorphicShapesAndTransforms;

public abstract class AbstractShape2D {
private final String name;
private double centerX;
private double centerY;
public AbstractShape2D(String name,double centerX, double centerY){
    this.name=name;
    this.centerX=centerX;
    this.centerY=centerY;
}

    public String getName() {
        return name;
    }

    public double getCenterX() {
        return centerX;
    }

    public double getCenterY() {
        return centerY;
    }

    public abstract double getArea();
public abstract double getPerimeter();
public final double getIsoperimetricQuotient(){
    return (4*Math.PI * getArea())/Math.pow(getPerimeter(),2);
};

    @Override
    public String toString() {
        return String.format("%s['%s', center=(%.1f; %.1f)",
                getClass().getSimpleName(), name, centerX, centerY);
    }
}
