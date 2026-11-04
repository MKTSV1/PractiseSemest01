package semestr1.practise10;


public class BankCardInstrument extends PaymentInstrument {

    public BankCardInstrument(String payerName) {
        super(payerName);
    }

    @Override
    public double calculateFee(double amount) {
        return amount - (0.85 * amount + 5.0);
    }
}
