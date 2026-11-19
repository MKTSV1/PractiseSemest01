package semestr1.practise11;

public class Task5 {
    public static void testIntegerPool(){
        Integer a = 100;
        Integer b = 100;
        Integer x = 250;
        Integer y = 250;
        System.out.println(a == b);
        System.out.println( x == y);
        System.out.println(x.equals(y));
    }
}
