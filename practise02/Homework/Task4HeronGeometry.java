package semestr1.practise02.Homework;

public class Task4HeronGeometry {
    public static void main(String[] args) {
        double a = 7.0;
        double b = 8.0;
        double c = 9.0;
        double P = a + b + c;
        double p = P/2;
        double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        double r = S/p;
        double areaOfCircle = Math.PI * Math.pow(r , 2);
        double R = (a*b*c)/(4.0*S);
        double areaOf2Circle = Math.PI * Math.pow(R, 2);
        System.out.println("================ ГЕОМЕТРИЧНИЙ ЗВІТ ===============" +
        "\nСторони: a = " + a +", b = "+b+", c = "+c+
        "\nПериметр (P):               "+P+
        "\nНапівпериметр (p):          "+p+
        "\nПлоща трикутника (S):       "+S+" кв. од."+
        "\nРадіус вписаного кола (r):  "+r+
        "\nПлоща вписаного круга:      "+areaOfCircle+" кв. од."+
        "\nРадіус описаного кола (R):  "+R+
        "\nПлоща описаного круга:      "+areaOf2Circle+ " кв. од."+
        "\n==================================================");

    }
}
