package semestr1.practise05;

public class Task2WarehouseInventory {
    public static void main(String[] args) {
        String[] items = {"Ноутбук", "Смартфон", "Бездротові навушники", "Механічна клавіатура", "Монітор 27\""};
        int[] quantities = {8, 3, 25, 4, 12};
        double[] prices = {28500.0, 19200.0, 1850.0, 3100.0, 9400.0};
        double[] totalValues = new double[items.length];
        String maxItems = " ";
        double maxTotalValues = 0;
        double totalSum = 0;
        boolean warning = false;
        System.out.println("=================== ЗВІТ СКЛАДУ ЕЛЕКТРОНІКИ ===================\n" +
                "№ | Назва товару            | К-сть | Ціна (грн) | Загальна вартість\n" +
                "----------------------------------------------------------------");
        for (int i = 0; i < items.length; i++) {
            totalValues[i] = quantities[i] * prices[i];
            System.out.printf("%-2d | %-23s | %-6s | %-10.2f | %.2f грн\n", (i + 1), items[i], quantities[i] + " шт.", prices[i], totalValues[i]);
        totalSum += totalValues[i];
        if (maxTotalValues < totalValues[i]){
            maxTotalValues = totalValues[i];
            maxItems = items[i];
            if (quantities[i] > 5){
                warning = true;

            }
        }
        }
        System.out.println("----------------------------------------------------------------");
        System.out.println("Загальна вартість складу:  " +totalSum +
        "\nНайбільший капітал у товарі: " + maxItems + " (" + maxTotalValues + "грн)");
        System.out.println();
        if (warning){
            System.out.println("\uD83D\uDEA8 ДЕФІЦИТНІ ПОЗИЦІЇ (менше 5 шт.): ");
            for (int i = 0; i < items.length; i++) {
                if (quantities[i] < 5){
                    System.out.println("- " + items[i] + " (залишилось: " + quantities[i] + "шт.) -> ⚠\uFE0F Терміново дозамовити!");
                }
            }
        }
        System.out.println("================================================================");
    }
}
