package semestr1.practise10;

public class EmperorPenguin extends AbstractBird implements SwimmingUnit{
    protected double weightKg;
    public EmperorPenguin(String species,double weightKg){
        super(species,weightKg);
    }
    @Override
    public String makeSound() {
        return "УА";
    }

    @Override
    public double getDiveDepthMeters() {
        return 100;
    }
}
