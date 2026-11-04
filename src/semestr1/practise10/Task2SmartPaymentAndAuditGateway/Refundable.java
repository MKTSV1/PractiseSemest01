package semestr1.practise10.Task2SmartPaymentAndAuditGateway;

public interface Refundable {
boolean requestRefund(String reason);
boolean isRefunded();
}
