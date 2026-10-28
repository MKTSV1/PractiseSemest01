package semestr1.practise08;

public class StaffMember {
    private String name;
    private double baseSalary;
    public StaffMember(String name,double baseSalary){
        this.baseSalary = baseSalary;
        this.name = name;
    }
    public double calculateMonthlyPay(){
        return baseSalary;
    }
    @Override public String toString(){
        return String.format("Ім'я = %s | Базова зарплатня = %.2f",name,baseSalary);
    }
}
