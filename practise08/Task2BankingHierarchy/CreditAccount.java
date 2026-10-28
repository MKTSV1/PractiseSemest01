package semestr1.practise08.Task2BankingHierarchy;

public class CreditAccount extends BankAccount{
    private double creditLimit;
    private double feePercent;
    public CreditAccount(String iban,String ownerName,double initialBalance,double creditLimit,double feePercent){
        super(iban,ownerName,initialBalance);
        this.creditLimit =creditLimit;
        this.feePercent =feePercent;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount <= 0){
            System.out.println("ВІДМОВА (сума має бути більшою за 0)");
            return false;
        }
        if (balance >= amount){
            return super.withdraw(amount);
        }
        double borrowed= amount - Math.max(0.0,balance);
        double fee = borrowed * (feePercent / 100.0);
        if (balance - amount - fee > creditLimit){
            this.balance = balance - amount - fee;
            System.out.println(String.format("(%.0f грн у кредит з комісією %.0f%% = %.0f грн)... УСПІШНО!",
                    borrowed, feePercent, fee));
            return true;
        }
        System.out.println(String.format("ВІДМОВА (перевищено кредитний ліміт %.2f грн)", creditLimit));
        return false;
    }
    public double getCurrentDebt(){
        return balance < 0 ? Math.abs(balance) : 0.0;
    }
    @Override
    public String toString(){
            return "CreditAccount{" + super.toString()
                    + String.format(", Ліміт: %.2f грн, Борг: %.2f грн}", creditLimit, getCurrentDebt());    }
}
