package semestr1.practise07;

public class MathUtils {
    private MathUtils() {}
    public static final double PI = 3.1415926535;
    public static final double E = 2.7182818284;
    public static long factorial(int n){
        int factorial = 1;
        for (int i = 1; i < n; i++) {
        factorial = factorial * (i+1);
        }
        return factorial;
    }
    public static double power(double base, int exp){
    if (exp == 0){
        return base = 1;
    }
    if (exp < 0 ){
        for (int i = 0; i < exp; i++) {
            base = base *  base;
        }
        return base = 1.0 / base;
    }
    if (exp > 0){
        for (int i = 0; i < exp; i++) {
            base = base * base;
        }
    }
        return base;
    }
    public static int gcd(int a, int b){
        int gcd = 0;
        while (b == 1|| a == 1) {
            if (a % 2 == 0 && b % 2 == 0) {
                gcd = 2;
                gcd = gcd + gcd;

                a = a / gcd;
                b = b / gcd;
            }
            if (a % 3 == 0 && b % 3 == 0) {
                gcd = 3;
                gcd = gcd + gcd;

                a = a / gcd;
                b = b / gcd;
            }
            if (a % 5 == 0 && b % 5 == 0) {
                gcd = 5;
                gcd = gcd + gcd;

                a = a / gcd;
                b = b / gcd;
            }
        }
        return gcd;
    }

}
