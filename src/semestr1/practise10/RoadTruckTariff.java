package semestr1.practise10;

public class RoadTruckTariff extends ShippingTariff{
public RoadTruckTariff(double weightKg,double distanceKm){
    super(weightKg,distanceKm);
}

    public String getName(){
    return "RoadTruckTariff";
}
@Override
    public double calculateCost() {
        return 15.0 * getDistanceKm() + 2.5 * getWeightKg();
    }
}
