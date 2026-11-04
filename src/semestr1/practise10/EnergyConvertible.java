package semestr1.practise10;

public interface EnergyConvertible {
    public static final double SPEED_OF_LIGHT = 299_792_458.0;
    public static final double JOULES_PER_KWH = 3_600_000.0;
    double getEnergyJoules();
    default double getEnergyKwh(){
        return getEnergyJoules() / JOULES_PER_KWH;
    }
}
