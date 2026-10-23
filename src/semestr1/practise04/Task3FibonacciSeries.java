package semestr1.practise04;

import java.util.Scanner;

public class Task3FibonacciSeries {
    public static void main(String[] args) {
        int number = 0;
        double ratio = 0.0;
        do {
            System.out.println("Кількість чисел Фібоначчі N");

            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();
        } while (number <= 3);
        int f1 = 1;
        int f2 = 1;
        int spaceI = 0;
        int spaceF1 = 0;
        for (int i = 1; i <= number; i++) {
            int next = f1 + f2;
            ratio = (double) next / f2;
            f1 = f2;
            f2 = next;
            System.out.printf("№ %-2d | Число: %-10d | Відношення F(n)/F(n-1) = %.6f\n", i, next, ratio);
        }
            System.out.println(
                    "Підсумок: знайдено наближення Золотого перетину: " + ratio);
            System.out.println("""
                    Еталонне значення:                               1.618034
                    ========================================================""");

        }
    }