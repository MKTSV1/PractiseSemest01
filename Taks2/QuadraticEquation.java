package semestr1.practise06.Taks2;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public void setCoefficients(double a, double b , double c){
        this.a = a;
        this.b = b;
        this.c = c;
        if (a==0){
            System.out.println("Увага: коефіцієнт 'a' не може дорівнювати 0 (це лінійне рівняння)!");
            this.a = 1.0;
        }
    }
    public double getDiscriminant(){
        return Math.pow(b,2) - 4 * a * c;
    }
    public boolean hasRealRoots(){
        return  getDiscriminant() >=0;
    }
    public double getRoot1(){
        if (!hasRealRoots()){
            return Double.NaN;
        }
        return  (-b + Math.sqrt(getDiscriminant()))/(2 * a);
    }
    public double getRoot2(){
        if (!hasRealRoots()){
            return Double.NaN;
        }
        return (-b - Math.sqrt(getDiscriminant()))/(2 * a);

    }
    private String term(double value) {
        if (value < 0) {
            return "(" + value + ")";
        }
        return String.valueOf(value);
    }
    public void printSolution(){
        System.out.println("Рівняння: " + term(a) + " * x^2 + " + term(b) + " " + term(c) + " = 0");
    double D = getDiscriminant();
        System.out.println("Дискримінант D = " + D);
        if (D > 0) {
            System.out.println("Рівняння має 2 дійсні корені:");
            System.out.println("x1 = " + getRoot1());
            System.out.println("x2 = " + getRoot2());
        }else if(D== 0){
            System.out.println("Рівняння має 1 дійсний корень:");
            System.out.println("x1 = " + getRoot1());
        }else{
            System.out.println("Рівняння не має коренів");
        }
        System.out.println("-------------------------------------");

    }
}
