package semestr1.practise02.Homework;

public class Task5RpgHero {
    public static void main(String[] args) {
        int strength = (int)(Math.random() * (18 - 8 + 1)) + 8;
        int agility = (int)(Math.random() * (18 - 8 + 1)) + 8;
        int intelligence = (int)(Math.random() * (18 - 8 + 1)) + 8;
        int maxHP = strength *24;
        int maxMP = intelligence * 15;
        int armor = agility/2;
        int dice1 = (int)(Math.random() * 6) + 1;
        int dice2 = (int)(Math.random() * 6) + 1;
        int playerAttack = (int)(dice1 + dice2 + strength *0.33 + agility * 0.43 + intelligence * 0.33);
        final int MONSTER_ATTACK = 22;
        boolean isPlayerVictory = playerAttack >= MONSTER_ATTACK;
        System.out.println("""
                 /**************************************************\\
                 |                 ПАСПОРТ ГЕРОЯ DOTA2              |
                 \\**************************************************/"""+
        "\nІм'я персонажа:          Арк Варден"+
        "\nРоль:                    Мід" +

        "\n[ХАРАКТЕРИСТИКИ]"+
        "\nСила (STR):              "+strength +
        "\nСпритність (AGI):        "+agility +
        "\nІнтелект (INT):          "+intelligence +

        "\n[ПОХІДНІ АТРИБУТИ]"+
        "\nОчки здоров'я (HP):      "+maxHP+
        "\nОчки мани (MP):          "+maxMP+
        "\nКлас броні (Armor):      "+armor+

        "\n[СИМУЛЯЦІЯ БОЮ]"+
        "\nКидок кубиків гравця:    "+dice1 + "+" + dice2+ "(бонус атрибутів: "+ (int)(strength *0.23 + agility * 0.53 + intelligence * 0.23) +")"+
        "\nЗагальна атака гравця:   "+playerAttack+
        "\nСила удару монстра:      "+MONSTER_ATTACK+
        "\nЧи переміг гравець?      "+isPlayerVictory+
"\n\\**************************************************/");
    }
}
