package semestr1.practise10;

public class Task2 {

    public static Shape2D findMaxAreaShape(Shape2D[] shapes) { //[cite: 2]
        if (shapes == null || shapes.length == 0) {
            return null;
        }

        Shape2D maxShape = shapes[0];
        double maxArea = maxShape.getArea();

        for (int i = 1; i < shapes.length; i++) {
            double currentArea = shapes[i].getArea();
            if (currentArea > maxArea) {
                maxArea = currentArea;
                maxShape = shapes[i];
            }
        }

        return maxShape;
    }
    }