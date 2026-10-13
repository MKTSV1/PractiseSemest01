package semestr1.practise05;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class practise05 {
    public static void main(String[] args) {
        //Завдання 1
    int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[0] = 10;
            numbers[1] = 20;
            numbers[2] = 30;
            numbers[4] = 50;
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(numbers));
       //
        //Завдання 2
        String[] days = {"Понеділок,  ","Вівторок, " ,"Середа, " ,"Четверг, ","П'ятниця, ","Суббота, ", "Неділя"};
        System.out.println(days.length);
        System.out.println(days[0]);
        System.out.println(days[days.length-1]);
        for (int i = 0; i <days.length ; i++) {

            System.out.print(days[i]);
        }
            //
        //Завдання 3
        double[]prices =  {120.50, 45.00, 890.99, 15.30, 420.00};
        System.out.println(prices[0]);
        prices[2] = prices[2] * 0.8;
        for (int i = 0; i < prices.length ; i++) {
        }
        System.out.println(Arrays.toString(prices));

        //
        /*Завдання 4
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N  ; i++) {
        arr[i] = i +1;
            System.out.print(arr[i] + ", ");
        }
        */
        //Завдання 5
        int[] arrgs = new int[6];
        arrgs[0] = 4;
        arrgs[1] = 8;
        arrgs[2] = 15;
        arrgs[3] = 16;
        arrgs[4] = 23;
        arrgs[5] = 42;
        for (int i = arrgs.length-1; i >= 0; i--) {
            System.out.print(arrgs[i] + " ");
        }
        System.out.println();
        System.out.println();
        //
        //Завдання 6
        int[] arr1 = new int[10];
        arr1[0] = 1;
        for (int i = 1; i < arr1.length ; i++) {
            arr1[i] = arr1[i-1] *2;
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
            if (i < arr1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        //
        //Завдання 7
        int[] original = {3, 7, 1, 9, 4};
        int[] copy = new int[5];
        for (int i = 0;  i < copy.length ; i++) {
            copy[i] = original[i];
            copy[0] = 999;
        }
        System.out.println(Arrays.toString(copy));
        System.out.print(Arrays.toString(original));
        System.out.println();
        //
        //Завдання 8
        double result = 0;
        double[] grades = {95, 84, 70, 99, 65, 88, 92};
        for (int i = 0; i < grades.length; i++) {
            grades[i] = result + grades[i];
            result = grades[i];
        }
        System.out.println(result);
        result = result / grades.length;
        System.out.println(result);

        //
        //Завдання 9
        int[] temps = {18, 21, 15, 24, 13, 27, 20};
        int min = temps[0];
        int max = temps[0];
        int countmin = 0;
        int countmax = 0;
        for (int i = 1; i < temps.length; i++) {
            if (temps[i] >max) {
                max = temps[i];
                countmax = i;
            }
            if (temps[i] < min){
                min = temps[i];
                countmin = i;
            }
        }
        System.out.println("Мінімум = " + min +   " індекс = " + (countmin +1));
        System.out.println("Максимум = " + max + " індекс = " + (countmax +1));
        //
        //Завдання 10
        int[] data = {12, -5, 0, 43, -19, 0, -2, 8, 0, 15};
        int countPlus =  0;
        int countMinus = 0;
        int countZero = 0;
        for (int i = 0; i <data.length; i++) {
            if (data[i] > 0) {
                countPlus++;
            }
            if (data[i] < 0) {
                countMinus++;
            }
            if (data[i] == 0) {
                countZero++;
            }
        }
        System.out.println(countPlus);
        System.out.println(countMinus);
        System.out.println(countZero);
        //
        //Завдання 11
        int primeCount =0;
        int notPrimeCount =0;
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() + i) * 7);
            System.out.print(array[i] + " ");
            if (array[i] % 2 == 0){
                primeCount++;
            }else{
                notPrimeCount++;
            }
        }
        System.out.println();
        System.out.println("Парні " + primeCount);
        System.out.println("Непарні " + notPrimeCount);
        //
        /*Завдання 12

        */
        /*Завдання 13

        */
        /*Завдання 14

        */
        /*Завдання 15

        */
        //Завдання 16
        String[] city = new String[]{"Київ", "Львів", "Харків", "Одеса", "Дніпро"};
        for (String citys : city){
            System.out.print("Ласкаво просимо до " + citys + "!\n");
        }
        //
        /*Завдання 17

        */
        //Завдання 18
        int[] arr = {1, 2, 3, 4, 5, 6};
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
        //
        /*Завдання 19

        */
        /*Завдання 20

        */
        /*Завдання 21

        */
        /*Завдання 22

        */
        //Завдання 23
        System.out.println();
        System.out.println();
        int[][] table = new int[3][3];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = (int) (Math.random() *100);
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }
        //
        //Завдання 24
        int[][] matrix = {
                {10, 20, 30, 40},
                {50, 60, 70, 80}
        };
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        System.out.println(matrix[0][0]);
        System.out.println(matrix[1][3]);
        //
        //Завдання 25
        System.out.println();
        System.out.println();
        int[][] grid = new int[3][4];
        int counter = 1;
        for (int i = 0; i <= grid.length - 1; i++) {
            for (int j = 0; j <= grid[0].length - 1; j++) {
                grid[i][j] = counter;
                System.out.print(grid[i][j] + "\t");
                counter++;
            }
            System.out.println();
        }

        //Завдання 26
        System.out.println();
        System.out.println();
        int[][] randomGrid = new int[4][3];
        for (int i = 0; i < randomGrid.length; i++) {
            for (int j = 0; j < randomGrid[0].length; j++) {
                randomGrid[i][j] = (int) ((Math.random() * 90) +10);
                System.out.print(randomGrid[i][j] + "\t");
            }
            System.out.println();
        }
        //
        //Завдання 27
        System.out.println();
        System.out.println();
        int[][] multTable = new int[10][10];
        for (int i = 0; i < multTable.length; i++) {
            for (int j = 0; j < multTable[0].length; j++) {
                multTable[i][j] = (i + 1) * (j +1);
                System.out.print(multTable[i][j] + "\t");
            }
            System.out.println();
        }
        //
        /*Завдання 28

        */
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
        //Завдання 36
        System.out.println();
        System.out.println();
        int[][] ladder = new int[4][];
        for (int i = 0; i < ladder.length; i++) {
            ladder[i] = new int[i + 1];
        }
        for (int i = 0; i < ladder.length; i++) {
            for (int j = 0; j < ladder[i].length; j++) {
                ladder[i][j] = i;
            }
        }
        for (int i = 0; i < ladder.length; i++) {
            for (int j = 0; j < ladder[i].length; j++) {
                System.out.print(ladder[i][j] + " ");
            }
            System.out.println();
        }
            //
        /*Завдання 37

        */
        /*Завдання 38

        */
        /*Завдання 39

        */
        /*Завдання 40

        */
    }
}
