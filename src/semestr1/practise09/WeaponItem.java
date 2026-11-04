package semestr1.practise09;

public class WeaponItem {
    private final String name;
    private final int bonusDamage;
    private int durability;
    public WeaponItem(String name, int bonusDamage,int durability){
        this.name = name;
        this.bonusDamage = bonusDamage;
        this.durability = Math.max(0,Math.min(100,durability));
    }

    public int getBonusDamage() {
        return bonusDamage;
    }

    public int getDurability() {
        return durability;
    }

    public void useWeapon(){
        if (durability > 0) {
            durability -= 10;
        }
    }

    @Override
    public String toString() {
        if (durability > 0){
            return String.format("Зброя має назву %s, і бонус" +
                    " к шкоди %d, а міцність в неї %d", name, bonusDamage, durability);
    }
    return String.format("Зброя має назву %s, і бонус" +
            " к шкоди 0, так як зброя зламалась!", name);
    }
}
