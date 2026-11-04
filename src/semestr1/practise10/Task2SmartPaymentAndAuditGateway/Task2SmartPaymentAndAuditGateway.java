package semestr1.practise10.Task2SmartPaymentAndAuditGateway;

public class Task2SmartPaymentAndAuditGateway {
        static AbstractPaymentTransaction[] ledger = {
                new PremiumCardPayment("ТХ-101", 20000.00, false),
                new CryptoUsdtPayment("TX-102",8500.00,false),
                new TaxTreasuryPayment("TX-103",5000.00,false)

        };
    public static void main(String[] args) {
        System.out.println("===================== ПРОЦЕСИНГОВИЙ ЦЕНТР FINTECH (POLYMORPHISM & INTERFACES) ====================================");
        System.out.println("[1. ПРОВЕДЕННЯ ПАКЕТУ ТРАНЗАКЦІЙ (final process())]:");
        for (AbstractPaymentTransaction tx : ledger) {
            boolean isSuccess = tx.process();
            System.out.println("    " + (isSuccess ? "✅ " : "❌ ") + tx.toString());
        }
        System.out.println("\n[2. АВТОМАТИЧНИЙ АУДИТ МОЖЛИВОСТЕЙ (Pattern Matching instanceof)]:");
        double totalTurnover = 0;
        double totalFee = 0;
        double totalCashback = 0;
        for (AbstractPaymentTransaction tx : ledger) {
            totalTurnover += tx.getBaseAmountUah();
            totalFee += tx.calculateFee();
            if (tx instanceof CashbackCapable cc) {
                double rawCashback = tx.getBaseAmountUah() * cc.getCashbackRate();
                double actualCashback = cc.calculateCashback(tx.getBaseAmountUah());
                totalCashback += actualCashback;
                if (rawCashback > CashbackCapable.MAX_CASHBACK_UAH) {
                    System.out.printf("    [CashbackCapable] %s: розрахунковий %.0f%% = %.0f грн -> нараховано %.2f грн (Ліміт MAX_CASHBACK_UAH)\n",
                            tx.getTxId(), cc.getCashbackRate() * 100, rawCashback, actualCashback);
                } else {
                    System.out.printf("    [CashbackCapable] %s: нараховано %.0f%% крипто-бонусу = %.2f грн\n",
                            tx.getTxId(), cc.getCashbackRate() * 100, actualCashback);
                }
            }
            if (tx instanceof BlockchainVerifiable bv) {
                System.out.printf("    [BlockchainVerifiable] %s: Hash=%s, Підтверджень=%d (Finalized: %b)\n",
                        tx.getTxId(), bv.getTxHash(), bv.getConfirmations(), bv.isFinalized());
            }
            if (tx instanceof Refundable ref && tx.getTxId().equals("ТХ-101")) {
                boolean success = ref.requestRefund("Подвійне списання");
                System.out.printf("    [Refundable] Спроба повернення %s ('Подвійне списання'): %s\n",
                        tx.getTxId(), success ? "УСПІШНО ПОВЕРНЕНО!" : "ВІДМОВЛЕНО");
            }
        }
        System.out.println("\n[ПІДСУМКОВИЙ ЗВІТ ШЛЮЗУ]:");
        System.out.printf("Сумарний базовий оборот:    %8.2f грн\n", totalTurnover);
        System.out.printf("Сумарна комісія шлюзу:    %8.2f грн\n", totalFee);
        System.out.printf("Сумарний виплачений кешбек:%7.2f грн\n", totalCashback);
        System.out.println("==================================================================================");
    }
}
