package semestr1.practise10;

public class KineticBody implements EnergyConvertible{
private double mass;
private double volume;
public KineticBody(double mass,double volume){
    this.mass =mass;
    this.volume=volume;
}
    @Override
    public double getEnergyJoules() {
        return 0.5 * mass * Math.pow(volume,2);
    }
}
