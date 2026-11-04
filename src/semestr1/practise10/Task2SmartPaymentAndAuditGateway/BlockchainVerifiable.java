package semestr1.practise10.Task2SmartPaymentAndAuditGateway;

public interface BlockchainVerifiable {
String getTxHash();
int getConfirmations();
default boolean isFinalized(){
    return getConfirmations() >= 12;
}
}
