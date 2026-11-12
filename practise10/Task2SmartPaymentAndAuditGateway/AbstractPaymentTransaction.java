package semestr1.practise10.Task2SmartPaymentAndAuditGateway;

public abstract class AbstractPaymentTransaction {
private final String txId;
private double baseAmountUah;
private boolean processed;
public AbstractPaymentTransaction(String txId,double baseAmountUah, boolean processed){
    this.txId=txId;
    this.baseAmountUah=baseAmountUah;
    this.processed=processed;
}
public abstract double calculateFee();

    public double getBaseAmountUah() {
        return baseAmountUah;
    }
    public boolean isProcessed() {
        return processed;
    }

    public String getTxId() {
        return txId;
    }
    public abstract String getPaymentChannel();
public final boolean process(){
    if (baseAmountUah <=0 || processed == true){
        return false;
    }
    processed = true;
    return true;
}
public final double getTotalCharged(){
    return baseAmountUah + calculateFee();
}
}
