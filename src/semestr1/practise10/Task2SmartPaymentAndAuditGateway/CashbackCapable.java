package semestr1.practise10.Task2SmartPaymentAndAuditGateway;

public interface CashbackCapable {
double MAX_CASHBACK_UAH = 500.0;
double getCashbackRate();
default double calculateCashback(double baseAmount){
    return Math.min(MAX_CASHBACK_UAH,baseAmount * getCashbackRate());
}
}
