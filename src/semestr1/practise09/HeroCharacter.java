package semestr1.practise09;

public class HeroCharacter {
    private final String nickname;
    private int baseStrength;
    private WeaponItem equippedWeapon;
    public HeroCharacter(String nickname,int baseStrength,WeaponItem equippedWeapon){
        this.nickname =nickname;
        this.baseStrength =baseStrength;
        this.equippedWeapon =equippedWeapon;
    }
    public void equip(WeaponItem newWeapon){
        equippedWeapon = newWeapon;
    }
    public void unequip(){
        equippedWeapon =null;
    }
    public int attack(){
   if (equippedWeapon != null && equippedWeapon.getDurability() > 0) {
       equippedWeapon.useWeapon();
            return baseStrength + equippedWeapon.getBonusDamage();
        }
        return  baseStrength;
    }

    @Override
    public String toString() {
        return String.format("Чел з ніком %s із силою %d",nickname,baseStrength);
    }
}
