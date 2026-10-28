package semestr1.practise08;

public class PassengerCar extends Vehicle{
    private int passengerSeats;
    public PassengerCar(String brand,int maxSpeed,double fuelTankCapacity, int passengerSeats){
        super(brand,maxSpeed,fuelTankCapacity);
        this.passengerSeats = passengerSeats;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | %d Пасажирів", passengerSeats);
    }
}
