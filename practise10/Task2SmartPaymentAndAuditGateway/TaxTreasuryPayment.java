package semestr1.practise10.Task2SmartPaymentAndAuditGateway;

public final class TaxTreasuryPayment extends AbstractPaymentTransaction implements  Refundable{

    public TaxTreasuryPayment(String txId, double baseAmountUah, boolean processed) {
        super(txId, baseAmountUah, processed);
    }

    @Override
    public double calculateFee() {
        return 0.0;
    }

    @Override
    public String getPaymentChannel() {
        return "ДержКазначейство";
    }

    @Override
    public boolean requestRefund(String reason) {
        return false;
    }

    @Override
    public boolean isRefunded() {
        return false;
    }
    @Override
    public String toString() {
        return String.format("[%s | %s] Сума: %.2f грн | Комісія: %.2f грн | Всього: %.2f грн",
                getTxId(), getPaymentChannel(),getBaseAmountUah(),calculateFee(), getTotalCharged());
    }
}
