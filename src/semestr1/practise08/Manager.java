package semestr1.practise08;

public class Manager extends StaffMember{
    private double teamBonus;
    public Manager(String name,double baseSalary,double teamBonus){
        super(name,baseSalary);
        this.teamBonus = teamBonus;
    }
    @Override public double calculateMonthlyPay(){
        return super.calculateMonthlyPay() + teamBonus;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Бонус команди = %.2f | Розрахунок зарплати на місяць = %.2f",teamBonus,calculateMonthlyPay());
    }
}
