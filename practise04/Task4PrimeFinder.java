package semestr1.practise04;

import java.util.Scanner;

public class Task4PrimeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        int count =0;
        int i;
        do {
            System.out.println("Введіть верхню межу N: ");
            N = scanner.nextInt();
        }while(N <= 0);
        System.out.println("Знайдені прості числа у проміжку від 2 до " + N + ":");
        for (i = 2; i <= N; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                isPrime = false;
                break;
                }
            }
        if(isPrime){
            count++;
            System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("--- СТАТИСТИКА ---" +
        "\nУсього чисел у діапазоні:        " + i +
        "\nЗнайдено простих чисел:          " + count +
        "\nСума всіх простих чисел:         " +
        "\nЧастка простих чисел:            " +
        "\n==============================");
        }
    }
