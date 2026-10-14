package semestr1.practise06.Task1;

public class Fraction {
    private int numerator;
    private int denominator;
    public void setValues(int num, int den){
        if (den == 0){
            System.out.println("Помилка: знаменник не може дорівнювати 0!");
            den = 1;
        }
        if (den < 0){
            num = -num;
            den = -den;
        }
        this.numerator = num;
        this.denominator = den;
    }
    private int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public void simplify(){
        int g = gcd(numerator, denominator);
    numerator = numerator / g;
    denominator = denominator / g;
    }
    public double toDecimal(){
        double demicial = (double) numerator / denominator;
        return demicial;
    }
    public void add(int otherNum, int otherDen){
        if (otherDen == 0) {
            System.out.println("Помилка: знаменник не може дорівнювати 0!");
            return;
        }
        int newNum = numerator * otherDen + otherNum * denominator;
        int newDen = denominator * otherDen;
        setValues(newNum, newDen);
        simplify();
    }
    public void printFraction(){
        if (denominator == 1 ){
            System.out.print(numerator);
        }else{
            System.out.print(numerator + "/" + denominator);
        }
    }
    public int getNumerator() {
        return numerator;
    }
    public int getDenominator() {
        return denominator;
    }
}
