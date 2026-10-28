package semestr1.practise08.Task1GeometryInheritance;

public class Task1GeometryInheritance {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Cylinder cylinder = new Cylinder(5.0,10.0);
        Cone cone = new Cone(3.0,4.0);
        System.out.println("====================== ГЕОМЕТРІЯ ТІЛ ОБЕРТАННЯ=======================");
        System.out.println("Базове коло:");
        System.out.println(circle.toString());
        System.out.println();
        System.out.println("Цилінзр (успадковано від Circle):");
        System.out.println(cylinder.toString());
        System.out.println();
        System.out.println("Конус (успадковано від Circle):");
        System.out.println(cone.toString());
        System.out.println("=====================================================================");
    }
}
