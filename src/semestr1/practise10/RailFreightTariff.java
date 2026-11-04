package semestr1.practise10;

public class RailFreightTariff extends ShippingTariff{
    public RailFreightTariff(double weightKg, double distanceKm) {
        super(weightKg, distanceKm);
    }
    public String getName(){
        return "RailFreightTariff";
    }
    @Override
    public double calculateCost() {
        return 1200.0 + 4.0 * getDistanceKm() + 0.8 * getWeightKg();
    }
}
