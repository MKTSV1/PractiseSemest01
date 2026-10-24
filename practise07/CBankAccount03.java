package semestr1.practise07;

public class CBankAccount03 {
    private String accountNumber;
    private String ownerName;
    private double balance;
    public CBankAccount03(String accountNumber, String ownerName, double initialBalance){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = initialBalance;
        if (initialBalance < 0){
            this.balance = 0.0;
        }
    }
    public void deposit(double amount){
        if (amount >0){
    this.balance += amount;
        }
    }
    public void withdraw(double amount){
        this.balance = this.balance - amount;
    }
    public void printAccount() {
        if (this.balance < 0) {
            System.out.println("Недостатньо коштів");
        } else {
            System.out.println("Ваш Аккаунт" + "\nНомер " + accountNumber
                    + "\nІм'я " + ownerName + "\nБаланс " + balance);
            System.out.println();
        }
    }
}
