package semestr1.practise02.Homework;

public class Task3TriangleClassifier {
    public static void main(String[] args) {
        double a = 3.0;
        double b = 4.0;
        double c = 5.0;
        boolean exists = (a + b > c) && (a + c > b) && (b + c > a);
        boolean ifEquilateral = (a == b && b == c && c == a);
        boolean ifIsosceles = (a == b || b == c || a == c);
        boolean ifRectangular =((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2) || (Math.pow(b, 2) + Math.pow(c, 2 ) == Math.pow(a, 2) || ((Math.pow(a, 2) + Math.pow(c, 2 )) == Math.pow(b, 2))));
        System.out.println("Сторони трикутника: a = 3.0, b = 4.0, c = 5.0" +
                "\n--------------------------------------------------" +
        "\nЧи існує такий трикутник:        "+     exists +
        "\nЧи є рівностороннім:             "+          ifEquilateral +
        "\nЧи є рівнобедреним:              "+           ifIsosceles +
        "\nЧи є прямокутним:                "+             ifRectangular);
    }
}
