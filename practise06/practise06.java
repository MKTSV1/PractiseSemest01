package semestr1.practise06;

public class practise06 {
    public static void main(String[] args) {
        //Завдання 1
       Student s1 = new Student();
       s1.name = "Денис";
       s1.age = 19;
       s1.gpa = 4.75;
        //
        //Завдання 2
        Car car1 = new Car();
        Car car2 = new Car();
        car1.brand = "Toyota";
        car1.model = "Camry";
        car1.year = 2021;
        car1.speed = 180;
        car2.brand = "BMW";
        car2.model = "M5";
        car2.year = 2023;
        car2.speed = 250;
        //
        //Завдання 3
        Book emptyBook = new Book();
        System.out.println(emptyBook.title + " " + emptyBook.author + " " + emptyBook.pages + " " + emptyBook.isRead);
        //
        //Завдання 4
        Rectangle a = new Rectangle();
        a.height = 4.0;
        a.width  = 7.5;
        a.S = a.width * a.height;
        a.P = 2 * (a.width + a.height);
        //
        /*Завдання 5

        */
        /*Завдання 6

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
        //Завдання 16
        Printer print = new Printer();
        print.paperCount = 100;
        print.model = "Sumsung";
        print.printDocument("sdg" , 32);
        //
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
        //Завдання 24
        Triangle t1 = new Triangle();
        t1.a = 10;
        t1.b = 15;
        t1.c = 20;
        System.out.println(t1.isValid());
        System.out.println(t1.getPerimeter());
        System.out.println(t1.getArea());
        //
        /*Завдання 25

        /*Завдання 26

        */
        /*Завдання 27

        */
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
        //Завдання 33
        GradeBook g1 = new GradeBook();
        int[] g = {85, 92, 78, 96, 65};
        g1.setData("Міша", g);
        System.out.println();
        System.out.println("Середня оцінка " + g1.getAverage());
        System.out.println("Вища оцінка " + g1.getHighestGrade());
        System.out.println("Нижча оцінка " +g1.getLowestGrade());
        //
        //Завдання 34
        ArrayStats a1 = new ArrayStats();
        int[]nums = {67, 42, 52, 1488, 228, 322, 666, 333,1949,999};
        a1.setNumbers(nums);
        System.out.println();
        System.out.println(a1.countEvens());
        System.out.println(a1.countOdds());
        System.out.println(a1.calculateSum());
        //
        /*Завдання 35

        */
        /*Завдання 36

        */
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
