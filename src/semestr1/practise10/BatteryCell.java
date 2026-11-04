package semestr1.practise10;

public class BatteryCell implements EnergyConvertible{
    private double hours;
    private double vats;
    public BatteryCell(double hours,double vats){
        this.hours =hours;
        this.vats =vats;
    }
    @Override
    public double getEnergyJoules() {
        return hours * vats;
    }
}
