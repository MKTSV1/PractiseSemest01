package semestr1.practise05;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0.0;
        double y = 0;
        System.out.println("x");
        double x = scanner.nextDouble();
        for (int i = 0; i < 10000; i++) {
            scanner.nextLine();
            System.out.println("что делать");
            String whatToDo = scanner.nextLine();
            switch (whatToDo){
                case("*") -> result = x * y;
            }
            System.out.println("y");
            y = scanner.nextDouble();
            if (whatToDo.equalsIgnoreCase("*")) {
                result = x * y;
                System.out.println(result);
            }

            if (whatToDo.equalsIgnoreCase("/") || whatToDo.equalsIgnoreCase(":")) {
                if (y == 0) {
                    System.out.println("Неможливо поділити на нуль");
                    continue;
                }
                result = x / y;
                System.out.println(result);
            }
            if (whatToDo.equalsIgnoreCase("+")) {
                result = x + y;
                System.out.println(result);
            }
            if (whatToDo.equalsIgnoreCase("-")) {
                result = x - y;
                System.out.println(result);
            }
            if (whatToDo.equalsIgnoreCase("reset")) {
                System.out.println("x");
                x = scanner.nextInt();
            }else {
                x = result;
            }
        }
    }
}
