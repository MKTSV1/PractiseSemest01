package semestr1.practise04;

import java.util.Scanner;

public class practise04 {
    public static void main(String[] args) {
        /*Завдання 1
        for (int i = 0; i <7 ; i++) {
            System.out.println("Java - надійна та кросплатформна мова!");
        }
        */
        /*Завдання 2
                Scanner scanner = new Scanner(System.in);
                String text = scanner.nextLine();
                for (int N = scanner.nextInt(); N >= 1; N++) {
                    System.out.println("[" + N + "] " + text);
                }

                scanner.close();
        */
        /*Завдання 3
        int monthlyIncome = 500;
        for (int i = 1; i < 13 ; i++) {
            System.out.println("Місяць " + i  + ": " + monthlyIncome);
            monthlyIncome += 500;
        }
        */
        /*Завдання 4
        double rate = 45.5;
        for (int i = 10; i < 101 ; i+=10) {
            double grivnya = i * rate ;
            System.out.println(i + "євро = " + grivnya+ "грн, ");
        }


        */
        /*Завдання 5
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        for (int i = 0; i < w ; i++) {
            System.out.print("=");
        }
        */
        /*Завдання 6
        int i = 10;
        while (i >= 0){
            System.out.print(i + " ");
            i--;
            continue;
        }
        System.out.println("Поїхали! Ракета запущена!");
        */
        /*Завдання 7

         */
        /*Завдання 8

         */
        /*Завдання 9

         */
        /*Завдання 10

         */
        /*Завдання 11

         */
        /*Завдання 12

         */
        /*Завдання 13

         */
        /*Завдання 14

         */
        /*Завдання 15

         */
        /*Завдання 16

         */
        /*Завдання 17

         */
        /*Завдання 18

         */
        /*Завдання 19

         */
        /*Завдання 20

         */
        /*Завдання 21

         */
        /*Завдання 22

         */
        /*Завдання 23

         */
        /*Завдання 24

        */
        /*Завдання 25

        /*Завдання 26

        */
        /*Завдання 27

        */
        //Завдання 28
int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть перший член прогресії");
        int a = scanner.nextInt();
        System.out.println("Введіть різницю прогресії");
        int d = scanner.nextInt();
        do {
            System.out.println("Введіть кількість членів прогресії");
            n = scanner.nextInt();
            scanner.nextLine();
            if (n <=0) {
                System.out.println("Членів винно буде більше 0");
            }
        }  while (n <= 0) ;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            a += d;
        }
        //
        /*Завдання 29

        */
        /*Завдання 30

         */
        /*Завдання 31

         */
        /*Завдання 32

         */
        /*Завдання 33

         */
        /*Завдання 34

         */
        /*Завдання 35

         */
        /*Завдання 36
        for (int a = 1; a < 11; a++) {


            for (int b = 1; b < 11; b++) {
                System.out.print((a * b) + "    ");
                switch (b) {
                    case 10 -> System.out.print("\n");
                }
                if (a*b <10){
                    System.out.print(" ");
                }
            }
        }


            */
        /*Завдання 37
        Scanner scanner = new Scanner(System.in);
        System.out.println("ВИСОТА");
        int height = scanner.nextInt();
        scanner.nextLine();
        System.out.println("ШИРИНА");
        int width = scanner.nextInt();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {

                if (i == 0 || i == height -1|| j == 0 ||j == width - 1){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
            */
            /*Завдання 38
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
               System.out.print("*");
            }
            System.out.println();
        }
            */
            /*Завдання 39
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
        for (int i = 2; i <= N; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i ; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }

            }
            if(isPrime) {
                System.out.print(i + " ");
            }
        }
             */
            /*Завдання 40
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
        for (int i = 0; i <N; i++) {
            for (int j = 0; j <N; j++) {

                if ((i + j) % 2.0 == 0.0){
                    System.out.print("#");
                }
                if ((i + j) % 2.0 != 0.0){
                    System.out.print("_");
                }
            }
            System.out.println();
        }
             */
            /*Завдання 41
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть непарне число");
        int N = scanner.nextInt();
        if (N % 2 == 0){
            System.out.println("НУ ДИВИСЬ НА КРІВИЙ ПЛЮСИК ТОДІ");
        }
        for (int i = 1; i <=N; i++) {

            for (int j = 1; j <=N; j++) {
                if (j  == (N +1) / 2){
                    System.out.print("*");
                }else if ((i == (N+1) /2)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

             */
    }
}