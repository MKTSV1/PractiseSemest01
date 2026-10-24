package semestr1.practise02.Homework;

public class Task1CurrencyExchange {
    public static void main(String[] args) {
        double usdAmount = (250.0);
        final double EXCHANGE_RATE = 41.25;
        final double COMMISSION_PERCENT = 1.5;
        double beforeComission = 250.0 * 41.25;
        double comission = Math.round(beforeComission * COMMISSION_PERCENT / 100 *100.0) /100.0;
        double userCash = beforeComission - comission;
        double userCash2 = (int)Math.round(userCash * 1.0) / 1.0;
        int userCash3 = (int)userCash2;
        System.out.println("================ КВИТАНЦІЯ ОБМІНУ ================" +
        "\nСума до обміну:              "  +           usdAmount + " USD" +
        "\nКурс валют:                  "       +          EXCHANGE_RATE +  " UAH/USD" +
        "\nНараховано до комісії:       " +     beforeComission + " UAH" +
        "\nКомісія банку (" + COMMISSION_PERCENT + "%):        "     + comission +  " UAH" +
        "\n--------------------------------------------------" +
        "\nЧиста сума до видачі:        "  +  userCash +  " UAH" +
        "\nДо видачі готівкою:          "    +    userCash3  + " UAH" +
       "\n==================================================);");
    }
}