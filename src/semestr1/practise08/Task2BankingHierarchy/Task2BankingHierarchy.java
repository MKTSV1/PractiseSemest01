package semestr1.practise08.Task2BankingHierarchy;

public class Task2BankingHierarchy {
    public static void main(String[] args) {
        System.out.println("================ БАНКІВСЬКА ІЄРАРХІЯ РАХУНКІВ ================");
        System.out.println("1. Ощадний рахунок (початковий стан):");
        SavingsAccount savings = new SavingsAccount("UA101", "Олена Коваль", 5000.0, 12.0, 1000.0);
        System.out.println(savings);
        System.out.print("→ Спроба зняти 4500 грн: ");
        savings.withdraw(4500);
        System.out.println("→ Нарахування річних відсотків (+12%)...");
        savings.applyInterest();
        System.out.println(savings);

        System.out.println();
        System.out.println("2. Кредитний рахунок (початковий стан):");
        CreditAccount credit = new CreditAccount("UA202", "Максим Бондар", 2000.0, 10000.0, 2.0);
        System.out.println(credit);
        System.out.print("→ Покупка на 5000 грн ");
        credit.withdraw(5000);
        System.out.println(credit);
        System.out.println("==============================================================");
    }
}