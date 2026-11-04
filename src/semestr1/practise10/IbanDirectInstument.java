package semestr1.practise10;

public class IbanDirectInstument extends PaymentInstrument{

    public IbanDirectInstument(String payerName) {
        super(payerName);
    }

    @Override
    public double calculateFee(double amount) {
        if (amount < 50_000){
            return amount - amount;
        };
        return amount - (amount * 0.95);
    }
}
