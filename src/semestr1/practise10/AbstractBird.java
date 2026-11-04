package semestr1.practise10;

public abstract class AbstractBird {
protected final String species;
protected double weightKg;
public AbstractBird(String species,double weightKg){
    this.species =species;
    this.weightKg =weightKg;
}
public abstract String makeSound();
}
