package semestr1.practise08;

public class SalesPerson extends  StaffMember{
    private double salesVolume;
    private double commisionRate;
    public SalesPerson(String name,double baseSalary,double salesVolume, double commisionRate){
        super(name,baseSalary);
        this.salesVolume = salesVolume;
        this.commisionRate = commisionRate;
    }
    @Override public double calculateMonthlyPay(){
        return super.calculateMonthlyPay() + salesVolume * (commisionRate / 100.0);
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Кількість продаж = %.2f | Коміссія = %.2f | Розрахунок заробітньої плати на місяць = %.2f",salesVolume,commisionRate,calculateMonthlyPay());
    }
}
