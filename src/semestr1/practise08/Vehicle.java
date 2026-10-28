package semestr1.practise08;

public class Vehicle {
    protected String brand;
    protected int maxSpeed;
    protected double fuelTankCapacity;
    public Vehicle(String brand,int maxSpeed,double fuelTankCapacity){
        this.brand = brand;
        this.maxSpeed  = maxSpeed;
        this.fuelTankCapacity = fuelTankCapacity;
    }
@Override public String toString(){
        return String.format("Бренд = %s | Максимальна швидкість = %d | Паливо = %.2f",brand,maxSpeed,fuelTankCapacity);
}
}
