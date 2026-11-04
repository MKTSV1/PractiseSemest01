package semestr1.practise10;

public class AirCargoTariff extends ShippingTariff{
    public AirCargoTariff(double weightKg, double distanceKm) {
        super(weightKg, distanceKm);
    }
    public String getName(){
        return "AirCargoTariff";
    }
    @Override
    public double calculateCost() {
        return 45.0 * getDistanceKm() + 18.0 * getWeightKg()+ 500;
    }
}
