package semestr1.practise06.Task2;

public class Task2QuadraticEquation {
    public static void main(String[] args) {
        QuadraticEquation q1 = new QuadraticEquation();
        q1.setCoefficients(1, -5,6);
        System.out.println("=== РОЗВ'ЯЗУВАЧ КВАДРАТНИХ РІВНЯНЬ ===");
        System.out.println("Тест 1");
        q1.printSolution();


        QuadraticEquation q2 = new QuadraticEquation();
        q2.setCoefficients(1, -4,4);
        System.out.println("=== РОЗВ'ЯЗУВАЧ КВАДРАТНИХ РІВНЯНЬ ===");
        System.out.println("Тест 2");
        q2.printSolution();
     }
    }
