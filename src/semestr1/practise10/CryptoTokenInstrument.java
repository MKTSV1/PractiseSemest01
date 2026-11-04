package semestr1.practise10;

public class CryptoTokenInstrument extends PaymentInstrument{
    private final double gasFeeUah;
    public CryptoTokenInstrument(String payerName,double gasFeeUah){
        super(payerName);
        this.gasFeeUah = gasFeeUah;
    }
    @Override
    public double calculateFee(double amount){
        return gasFeeUah;
    }
}
