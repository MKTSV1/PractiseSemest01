package semestr1.practise08;

public class Weapon {
    private String title;
    private int baseDamage;
    public Weapon(String title, int baseDamage){
        this.baseDamage =  baseDamage;
        this.title = title;
    }
    public int calculateDamage(){
        return baseDamage;
    }
    public String getTitle(){
        return title;
    }
    public int getBaseDamage(){
        return baseDamage;
    }
    @Override public String toString(){
        return String.format("%s наносить %d базову шкоду",title,baseDamage);
    }
}
