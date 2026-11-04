package semestr1.practise10;

public class BankVault implements Measurable{
    private double gold;
    public BankVault(double gold){
        this.gold =gold;
    }
    @Override
    public double getMeasure() {
        return gold;
    }
}
