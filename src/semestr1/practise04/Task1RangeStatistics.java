package semestr1.practise04;

import java.util.Scanner;

public class Task1RangeStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        int sumOfEvenNumber = 0;
        int quantityOfEvenNumber = 0;
        int sumOfNotEvenNumber =0;
        int quantityOfNotEvenNumber =0;
        double totalSum =0.0;
        do {
            System.out.println("\"=== АНАЛІЗАТОР ДІАПАЗОНУ ЧИСЕЛ === \" +\n" +
                    "Введіть число N:");
            number = scanner.nextInt();
            scanner.nextLine();
            if (number <= 0) {
                System.out.println("Помилка: N має бути більшим за 0!");
            }
        } while (number <= 0);
        for (int i = 1; i <= number; i++) {
            sum += i;
            if (i % 2== 0 ){
            sumOfEvenNumber += i;
            quantityOfEvenNumber ++;
            }
            if (i % 2 != 0 ){
                sumOfNotEvenNumber += i;
                quantityOfNotEvenNumber ++;
            }
            totalSum =(double)sum / number;
        }
        System.out.println(
        "\n--- РЕЗУЛЬТАТИ ДЛЯ ДІАПАЗОНУ [1 .. 10] ---" +
        "\nЗагальна сума чисел:       " + sum +
        "\nСума парних чисел:         " + sumOfEvenNumber + "(кількість: " +quantityOfEvenNumber+ ")" +
        "\nСума непарних чисел:       " + sumOfNotEvenNumber + "(кількість: " +quantityOfNotEvenNumber + ")"+
        "\nСереднє арифметичне:       " + totalSum +
        "\n=========================================");
    }
}
