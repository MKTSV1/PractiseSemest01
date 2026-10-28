package semestr1.practise08;

public class CargoTruck extends Vehicle{
    private double maxLoadTons;
    public CargoTruck(String brand,int maxSpeed,double fuelTankCapacity, double maxLoadTons){
        super(brand,maxSpeed,fuelTankCapacity);
        this.maxLoadTons = maxLoadTons;
    }
    public double calculateFuelConsumption() {
        double baseConsumption = 25.0;
        double extraPerTon = 1.5;
        return baseConsumption + extraPerTon * maxLoadTons;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" Склад на %.2f тонн",maxLoadTons);
    }
}
