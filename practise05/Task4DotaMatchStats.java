package semestr1.practise05;

import static java.lang.Long.max;

public class Task4DotaMatchStats {
    public static void main(String[] args) {
        String[] heroes = {"Puck", "Razor", "Ancient Apparation", "Phantom Lancer", "Tusk"};
        int[] kills   = {4,  8, 3, 4,  3};
        int[] deaths  = {11,  7,  7,  11,  8};
        int[] assists = {3, 5,  9,  4, 11};
        int[] netWorth = {14500, 21200, 24800, 9800, 12300};
        double[] kdaRatios = new double[5];
        int totalKills = 0;
        for (int i = 0; i < heroes.length ; i++) {
            totalKills = totalKills + kills[i];
            System.out.println(totalKills);
        }
        int totalNetWorth = 0;
        double maxKdaRations = 0;
        String MVP = " ";
        double killParticion = 0;
        System.out.println("""
                    ========================================================================
                                           🏆 DOTA 2: POST-MATCH REPORT
                    ========================================================================
                    Герой              | K / D / A  | Net Worth | KDA Ratio | Kill Participation
                    ------------------------------------------------------------------------""");
        for (int i = 0; i < heroes.length; i++) {
            kdaRatios[i] = (double)(kills[i] + assists[i]) / max(1,deaths[i]);
            kdaRatios[i] = Math.round(kdaRatios[i] * 100.0) / 100.0;
            totalNetWorth = totalNetWorth + netWorth[i];
            killParticion = (((double)kills[i] + (double)assists[i]) / (double)totalKills) * 100.0;
            killParticion = Math.round(killParticion * 100.0) / 100.0;
            if (maxKdaRations < kdaRatios[i]){
                maxKdaRations = kdaRatios[i];
                MVP = heroes[i];
            }
            System.out.printf("%-18s | %-12s | %-9d | %-9.2f | %.2f%%\n", heroes[i], kills[i] + " / " + deaths[i] + " / " + assists[i], netWorth[i], kdaRatios[i], killParticion);
        }
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Загальна кількість вбивств команди: " + totalKills +
        "\nСумарний Net Worth команди:          " + totalNetWorth + " золота\n" +
        "⭐ НАЙКРАЩИЙ ГРАВЕЦЬ МАТЧУ (MVP):    " + MVP + "(KDA: " + maxKdaRations + ")");
    }
}
