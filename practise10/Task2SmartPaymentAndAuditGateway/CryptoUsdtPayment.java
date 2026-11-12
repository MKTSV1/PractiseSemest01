package semestr1.practise10.Task2SmartPaymentAndAuditGateway;

public class CryptoUsdtPayment extends AbstractPaymentTransaction implements CashbackCapable,BlockchainVerifiable{

    public CryptoUsdtPayment(String txId, double baseAmountUah, boolean processed) {
        super(txId, baseAmountUah, processed);
    }

    @Override
    public double calculateFee() {
        return 40.0;
    }

    @Override
    public String getPaymentChannel() {
        return "USDT TRC-20";
    }

    @Override
    public String getTxHash() {
        return "\"0x9f8a...c4\"";
    }

    @Override
    public int getConfirmations() {
        return 18;
    }

    @Override
    public double getCashbackRate() {
        return 0.01;
    }
    @Override
    public String toString() {
        return String.format("[%s | %s] Сума: %.2f грн | Комісія: %.2f грн | Всього: %.2f грн",
                getTxId(), getPaymentChannel(),getBaseAmountUah(),calculateFee(), getTotalCharged());
    }
}
