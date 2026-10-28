package semestr1.practise08.Task2BankingHierarchy;

public class SavingsAccount extends BankAccount{
    private double interestRate;
    private double minBalance;
    public SavingsAccount(String iban, String ownerName,double initialBalance,double interestRate,double minBalance){
        super(iban,ownerName,initialBalance);
        this.interestRate = interestRate;
        this.minBalance = minBalance;
    }

    @Override
    public boolean withdraw(double amount) {
        if (balance - amount >= minBalance){
            return super.withdraw(amount);
        }
        System.out.println(String.format("ВІДМОВА (порушення незнижуваного залишку %.2f грн)", minBalance));
        return false;
    }
    public void applyInterest(){
        deposit(balance * (interestRate / 100.0));
    }
    @Override public String toString(){
        return "SavingAccount{" + super.toString()
                + String.format(", Ставка: %s%%, Мін.залишок: %.2f грн}", interestRate, minBalance);
    }
}
