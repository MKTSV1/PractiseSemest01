package semestr1.practise06.Task1;

public class Task1Fraction {
    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        f1.setValues(8,12);
        Fraction f2 = new Fraction();
        f2.setValues(3, 4);
            System.out.println("=== КАЛЬКУЛЯТОР ЗВИЧАЙНИХ ДРОБІВ ===");
        System.out.print("Дріб 1: ");
        f1.printFraction();
        f1.simplify();
        System.out.println();
        System.out.print("Після скорочення: " );
        f1.printFraction();
        System.out.print(" (десятковий вигляд: " + Math.round(f1.toDecimal() * 10000.0) / 10000.0);
        System.out.print(")");
        System.out.println();
        System.out.print("Додаємо дріб ");
        f2.printFraction();
        System.out.print(" до ");
        f1.printFraction();
        System.out.println("... ");
        System.out.print("Формула: ");
        f1.printFraction();
        System.out.print("+");
        f2.printFraction();
        int a = f1.getNumerator();
        int b = f1.getDenominator();
        int c = f2.getNumerator();
        int d = f2.getDenominator();
        System.out.println(" = (" + a + "*" + d + " + " + c + "*" + b + ") / ("
                + b + "*" + d + ") = " + (a * d + c * b) + "/" + (b * d));
        System.out.print("Результат додавання: ");
        f1.add(c,d);
        f1.printFraction();
        System.out.println(" (десятковий вигляд: " + Math.round(f1.toDecimal() * 10000.0) / 10000.0 + ")");
        System.out.println("=====================================");
        System.out.println();


        Fraction f3 = new Fraction();
        f3.setValues(-4,36);
        Fraction f4 = new Fraction();
        f4.setValues(18, -9);
        System.out.println("=== КАЛЬКУЛЯТОР ЗВИЧАЙНИХ ДРОБІВ ===");
        System.out.print("Дріб 1: ");
        f3.printFraction();
        f3.simplify();
        System.out.println();
        System.out.print("Після скорочення: " );
        f3.printFraction();
        System.out.print(" (десятковий вигляд: " + Math.round(f3.toDecimal() * 10000.0) / 10000.0);
        System.out.print(")");
        System.out.println();
        System.out.print("Додаємо дріб ");
        f4.printFraction();
        System.out.print(" до ");
        f3.printFraction();
        System.out.println("... ");
        System.out.print("Формула: ");
        f3.printFraction();
        System.out.print("+");
        f4.printFraction();
        int a1 = f3.getNumerator();
        int b1 = f3.getDenominator();
        int c1 = f4.getNumerator();
        int d1 = f4.getDenominator();
        System.out.println(" = (" + a1 + "*" + d1 + " + " + c1 + "*" + b1 + ") / ("
                + b1 + "*" + d1 + ") = " + (a1 * d1 + c1 * b1) + "/" + (b1 * d1));
        System.out.print("Результат додавання: ");
        f3.add(c1, d1);
        f3.printFraction();
        System.out.println(" (десятковий вигляд: " + Math.round(f3.toDecimal() * 10000.0) / 10000.0 + ")");
        System.out.println("=====================================");
    }
}
