package semestr1.practise10;

public abstract class ShippingTariff {
    private double weightKg;
    private double distanceKm;
    public ShippingTariff(double weightKg, double distanceKm){
        this.weightKg = weightKg;
        this.distanceKm=distanceKm;
    }

    public double getDistanceKm() {
        return distanceKm;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public abstract  double calculateCost();
    public abstract  String getName();
}
