package semestr1.practise05;

import java.util.Scanner;

public class Task1DailySales {
    public static void main(String[] args) {
        String[] days = {"Понеділок", "Вівторок", "Середа", "Четвер", "П'ятниця", "Субота", "Неділя"};
        double[] sales = new double[7];
        double sum = 0;
        double average = 0;
        double maxSales = 0;
        double minSales = 1_999_999_999;
        String theBestDay = " ";
        String theWorstDay = " ";
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== ФІНАНСОВИЙ ЗВІТ КАВ'ЯРНІ ЗА ТИЖДЕНЬ ===");
        for (int i = 0; i < days.length; i++) {
            System.out.println("Введіть виторг за " + days[i] + "(грн): ");
            sales[i] = scanner.nextDouble();
            scanner.nextLine();
            sum = sum + sales[i];
            average = sum / days.length;
            if (maxSales < sales[i]){
                maxSales = sales[i];
                theBestDay = days[i];
            }
            if (minSales > sales[i]){
                minSales = sales[i];
                theWorstDay = days[i];
            }
        }
        System.out.println("---------------- ПІДСУМКИ ----------------" +
                "\nЗагальний тижневий виторг:  " + sum +" грн" +
                "\nСередній виторг на день:    " + Math.round(average * 100) / 100 + " грн" +
                "\nНайкращий день:             " + theBestDay + " (" + maxSales + " грн)" +
                "\nНайгірший день:             " + theWorstDay + " ("+ minSales + " грн)");
        System.out.println();
        System.out.println("Дні з виторгом вище середнього: ");
        for (int i = 0; i < days.length; i++) {
            if (sales[i] > average){
                System.out.println("- " + days[i] + ": " + sales[i] + "грн");
            }
        }
        System.out.println("==========================================");
    }
}
