package semestr1.practise08;

public class EnchantedSword extends Weapon{
    private String element;
    private int enchantmentLevel;
    private int magicPower;
    public EnchantedSword(String title, int baseDamage,String element,int enchantmentLevel,int magicPower){
        super(title,baseDamage);
        this.element = element;
        this.magicPower =magicPower;
        this.enchantmentLevel = enchantmentLevel;
    }
    @Override public int calculateDamage(){
        return super.calculateDamage() + magicPower * enchantmentLevel;
    }
    @Override public String toString(){
        return super.toString() + String.format(" | Зачарован на %s %d , та наносить на %d більше за рахунок магії",element,enchantmentLevel,magicPower);
    }
}
