package semestr1.practise07;

public class LCar11 {
    private String brand;
    private String model;
    private int year;
    private double mileage;
    private boolean engineStarted;
    LCar11(String brand, String model, int year, double mileage){
     this.brand =brand;
     this.model = model;
     this.year = year;
     this.mileage = mileage;
    }
    LCar11(String brand, String model, int year){
        this(brand, model, year, 0);
    }
    LCar11(){
        this("Unknown","Standard",2024,0);
    }
    public void startEngine(){
this.engineStarted = true;
    }
    public void stopEngine(){
this.engineStarted = false;
    }
    public void drive(double distance){
if (engineStarted){
    this.mileage += distance;
    System.out.println(brand + " " + model + " " + year + " з пробігом "  + mileage +  " поїхала на " + distance + " кілометрів");
}else{
    System.out.println("Двигун не запущений");
}
    }
}
