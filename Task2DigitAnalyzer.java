package semestr1.practise04;

import java.util.Scanner;

public class Task2DigitAnalyzer {
    public static void main(String[] args) {
        int originalNumber;
        int numberOfDigits = 0;
        int sum = 0;
        int maxDigit = 0;
        int reversedNumber = 0;
        int digit = 0;
        String result = "Це звичайне число (не паліндром)";
    do {
        System.out.println("=== АНАЛІЗАТОР РОЗРЯДІВ ЧИСЛА ===" +
                "\nВведіть додатне ціле число: ");
        Scanner scanner = new Scanner(System.in);
        originalNumber = scanner.nextInt();
    } while (originalNumber <= 0);

        int number =originalNumber;
    while (number >0) {
        digit = number % 10;
        number /= 10;
        numberOfDigits++;
        sum += digit;
        if (digit > maxDigit){
            maxDigit = digit;
        }
        reversedNumber = reversedNumber * 10 + digit;
    }
    if (reversedNumber == originalNumber){
        result = ("Це число є ПАЛІНДРОМОМ!");
    }
        System.out.println("--- СТАТИСТИКА ЧИСЛА ---" +
        "\nПочаткове число:     " +originalNumber+
        "\nКількість цифр:      " +numberOfDigits+
        "\nСума цифр:           " +sum +
        "\nНайбільша цифра:     " +maxDigit +
        "\nПеревернуте число:   " +reversedNumber +
        "\nРезультат:           " +result +
        "\n================================");
    }
}
