package semestr1.practise09.Task1CompositeShapesCanvas;

    public class Task1CompositeShapesCanvas {
        public static void main(String[] args) {
            System.out.println("================== ГЕОМЕТРИЧНЕ ПОЛОТНО ==================");
            GeometryCanvas canvas = new GeometryCanvas("Інженерне креслення №1", 5);
            Circle2D circle = new Circle2D("Коло-А", new Point2D(0, 0), 5.0);
            Rectangle2D rect = new Rectangle2D("Плита-Б", new Point2D(10, 5), 4.0, 6.0);
            RightTriangle2D triangle = new RightTriangle2D("Клин-В", new Point2D(-3, 2), 3.0, 4.0);
            canvas.addShape(circle);
            canvas.addShape(rect);
            canvas.addShape(triangle);
            System.out.print(canvas.toString());
            System.out.println("---------------------------------------------------------");
            System.out.printf("Сумарна площа креслення:   %.2f кв.од.\n", canvas.getTotalArea());
            System.out.printf("Сумарний периметр:         %.2f од.\n", canvas.getTotalPerimeter());
            AbstractShape2D largest = canvas.findLargestShape();
            if (largest != null) {
                System.out.printf("Найбільша фігура:          %s (S = %.2f)\n", largest.getName(), largest.getArea());
            }
            System.out.println("-> Переміщуємо всі фігури полотна на вектор (+5.0; -2.0)...");
            canvas.moveAllShapes(5.0, -2.0);
            System.out.println("Новий центр '" + circle.getName() + "': " + circle.getAnchorPoint());
            System.out.println("========================================================================================");
        }
    }
