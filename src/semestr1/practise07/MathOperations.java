package semestr1.practise07;

public class MathOperations {
    public int add(int a, int b){
        System.out.println(a + b);
        return  a + b;
    }
    public double add(double a, double b){
        System.out.println(a + b);
        return a + b;
    }
    public int add(int a, int b, int c){
        System.out.println(a + b + c);
        return a + b + c;
    }
    public String add(String a, String b){
        System.out.println(a + " " + b);
        return  a + " " + b;
    }
    public int multiply(int a, int b){
        System.out.println(a * b);
        return a * b;
    }
    public double multiply(double a, double b){
        System.out.println(a * b);
        return  a * b;
    }
    public String multiply(String text, int times){
        for (int i = 0; i < times; i++) {
            System.out.println(text);
        }
        return text;
    }

}
