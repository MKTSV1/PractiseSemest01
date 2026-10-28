package semestr1.practise08.Task2BankingHierarchy;

import java.util.Locale;

public class BankAccount {
    private String iban;
    private String ownerName;
    protected double balance;
    public BankAccount(String iban,String ownerName,double initialBalance){
        this.iban = iban;
        this.ownerName =ownerName;
        this.balance = initialBalance;
        if (initialBalance <0){
            this.balance = 0.0;
        }
    }
    public String getIban(){
        return iban;
    }
    public String getOwnerName(){
        return ownerName;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if (amount >0){
            balance += amount;
        }
    }
    public boolean withdraw(double amount){
        if (amount>0 && amount <= balance){
            balance -= amount;
            return true;
        }
        System.out.println("ВІДМОВА (некоректна сума або недостатньо коштів)");
        return false;
    }
    @Override public String toString(){
        return String.format("Рахунок[%s | Власник: %s | Баланс: %.2f грн]",iban,ownerName,balance);
    }
}
