package semestr1.practise02.Homework;

public class Task2NumberAnalysis {
    public static void main(String[] args) {
        int number = 742;
        int hundreds =number / 100;
        int tens = number / 10 % 10;
        int units = number % 10;
        int reversedNumber = (units *100 + tens*10+hundreds);
        int sumOfNumber = hundreds + tens + units;
        boolean isSumEven = sumOfNumber % 2 == 0;
        System.out.println("Початкове число:         " + number + "\nРозряди:                 Сотні = " +hundreds +", Десятки = " + tens + ", Одиниці = " +units);
        System.out.println("Сума цифр:               " + (sumOfNumber));
        System.out.println("Добуток цифр:            " + (hundreds*tens*units));
        System.out.println("Перевернуте число:       " + reversedNumber);
        System.out.println("Чи є сума парною?        " + isSumEven);
    }
}
