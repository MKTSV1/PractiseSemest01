package semestr1.practise10.Task1PolymorphicShapesAndTransforms;

public class Task1PolymorphicShapesAndTransforms {
    public static double calculateTotalArea(AbstractShape2D[] shapes){
        double result = 0;
        for (int i = 0; i < shapes.length; i++) {
            result +=shapes[i].getArea() ;
        }
    return result;
    }
    public static void transformScene(AbstractShape2D[] shapes,double scaleFactor,double rotateDeg){
        System.out.printf("-> Виконуємо пакетну трансформацію (scale x%.1f, rotate +%.1f°) через instanceof...\n", scaleFactor, rotateDeg);
        for (AbstractShape2D shape : shapes) {
            boolean isTransformed = false;
            if (shape instanceof Scalable2D s) {
                s.scale(scaleFactor);
                if (shape instanceof CircleShape c) {
                    System.out.printf("[Scalable2D] '%s' масштабовано в %.1f разів (новий r=%.2f)\n", shape.getName(), scaleFactor, c.getRadius());
                } else if (shape instanceof RectangleShape r) {
                    System.out.printf("[Scalable2D] '%s' масштабовано в %.1f разів (%.2fx%.2f)\n", shape.getName(), scaleFactor, r.getWidth(), r.getHeight());
                }
                isTransformed = true;
            }
            if (shape instanceof Rotatable2D r) {
                r.rotate(rotateDeg);
                System.out.printf("[Rotatable2D] '%s' повернуто на +%.1f° (поточний кут: %.1f°)\n", shape.getName(), rotateDeg, r.getRotationAngle());
                isTransformed = true;
            }
            if (!isTransformed) {
                System.out.printf("[Info] '%s' (final class) пропущено — не підтримує трансформації.\n", shape.getName());
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
AbstractShape2D[] shapes = {
        new CircleShape("Коло-Лінза",0.0,0.0,5),
        new RectangleShape("Рамка-А",2.0,3.0,4.0,6.0,0.0),
        new ImmutableReferenceSquare("Еталон-Квадрат",10.0,10.0,5.0)
};
        System.out.println("======================= ПОЛІМОРФНА ГЕОМЕТРІЯ ТА ІНТЕРФЕЙСИ ТРАНСФОРМАЦІЙ ===================");
        System.out.println("[СТАН СЦЕНИ ДО ТРАНСФОРМАЦІЇ]:");
        for (int i = 0; i < shapes.length; i++) {
            int count = i + 1;
            System.out.println(count + ". " + shapes[i].toString());
        }
        System.out.println("Сумарна площа сцени: " + Math.round(calculateTotalArea(shapes) * 100.0) /100.0 + " кв.од");
        System.out.println();
        transformScene(shapes, 2.0, 45.0);
        System.out.println("[СТАН СЦЕНИ ПІСЛЯ ТРАНСФОРМАЦІЇ]:");
        for (int i = 0; i < shapes.length; i++) {
            System.out.println((i + 1) + ". " + shapes[i].toString());
        }
        System.out.printf("Нова сумарна площа сцени: %.2f кв.од.\n", calculateTotalArea(shapes));
        System.out.println("==========================================================================================");
    }
}

