package semestr1.practise10;

public abstract class PaymentInstrument {
    private final String payerName;
    public PaymentInstrument(String payerName){
        this.payerName =payerName;
    }
    public abstract double calculateFee(double amount);
    public double processPayment(double amount){
        return amount + calculateFee(amount);
    }
}
