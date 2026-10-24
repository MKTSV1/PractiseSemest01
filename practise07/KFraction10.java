package semestr1.practise07;

public class KFraction10 {
    private int numerator;
    private int denominator;
    private static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public KFraction10(int numerator, int denominator){
    if (denominator == 0){
        System.out.println("Error");
        this.denominator = 1;
    }
    this.numerator = numerator;
    if (denominator < 0){
        this.numerator = -numerator;
        this.denominator = Math.abs(denominator);
    }
        int g = gcd(numerator, denominator);
        this.numerator = numerator / g;
        this.denominator = denominator / g;
    }
    KFraction10(int wholeNumber){
        this(wholeNumber, 1);
    }
    KFraction10(){
        this(0,1);
    }
    public double toDouble(){
        return (double)numerator / denominator;
    }
    public void print(){
        if (denominator == 1) {
            System.out.println(numerator);
        }else{
                System.out.println(numerator + "/" + denominator);
            }
        System.out.println((double)toDouble());
    }
}
