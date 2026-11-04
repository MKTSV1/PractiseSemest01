package semestr1.practise10.Task2SmartPaymentAndAuditGateway;

public class PremiumCardPayment extends AbstractPaymentTransaction implements CashbackCapable,Refundable{

    public PremiumCardPayment(String txId, double baseAmountUah, boolean processed) {
        super(txId, baseAmountUah, processed);
    }

    @Override
    public double calculateFee() {
        return getBaseAmountUah() - getBaseAmountUah() * 0.99;
    }

    @Override
    public String getPaymentChannel() {
        return "Visa Infinite";
    }

    @Override
    public double getCashbackRate() {
        return 0.03;
    }
    private boolean refunded = false;
    @Override
    public boolean requestRefund(String reason) {
        if (isProcessed() && !refunded){
            refunded = true;
            return true;
        }
        return false;
    }

    @Override
    public boolean isRefunded() {
        return refunded;
    }
    @Override
    public String toString() {
        return String.format("[%s | %s] Сума: %.2f грн | Комісія: %.2f грн | Всього: %.2f грн",
                getTxId(),getPaymentChannel(),getBaseAmountUah(),calculateFee(), getTotalCharged());
    }
}
