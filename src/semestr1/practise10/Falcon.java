package semestr1.practise10;

public class Falcon extends  AbstractBird implements FlyableUnit{
    protected double weightKg;
    public Falcon(String species, double weightKg){
       super(species,weightKg);
    }
    @Override
    public String makeSound() {
        return "Кар";
    }

    @Override
    public double getFlightSpeedKmh() {
        return 70;
    }
}
