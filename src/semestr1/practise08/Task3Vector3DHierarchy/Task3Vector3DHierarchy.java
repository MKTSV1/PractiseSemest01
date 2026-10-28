package semestr1.practise08.Task3Vector3DHierarchy;

public class Task3Vector3DHierarchy {
    public static void main(String[] args) {
        Vector2D vector1 = new Vector2D(3.00,4.00);
        Vector3D vector2 = new Vector3D(3.00,4.00,12.00);
        Vector3D displacement = new Vector3D(2,0,5);
        ForceVector3D vector3 = new ForceVector3D("Тяга ракети",3.00,4.00,12.00);
        System.out.println("====================================" + "ІЄРАРХІЯ ВЕКТОРІВ(2D -> 3D ->FORCE)" +
                           "==================================== ");
        System.out.println("1. Рівень 1 (2D):" + vector1.toString());
        System.out.println("2. Рівень 2 (3D):" + vector2.toString());
        System.out.println("   Вектор переміщення S: " + displacement);
        System.out.println();
        System.out.println("3. Рівень 3 (Фізична сила):");
        System.out.println("   " + vector3);
        System.out.println("   -> Виконана механічна робота A = F * S = " +vector3.calculateWork(displacement) + "Дж");
        System.out.println("   -> Прискорення тіла масою 2.5 кг: a = " + vector3.calculateAcceleration(2.5) + " м/c^2");
        System.out.println("===========================================================================================================");
    }
}
