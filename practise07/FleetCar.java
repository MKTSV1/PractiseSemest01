package semestr1.practise07;

public class FleetCar {
    private String vinCode;
    private double currentMileage;
    private static int totalCars = 0;
    private static double totalCompanyMileage = 0.0;
    FleetCar(String vinCode, double initialMileage){
        this.vinCode = vinCode;
        totalCars ++;
        totalCompanyMileage = totalCompanyMileage + initialMileage;
    }
    public void addTrip(double km){
        this.currentMileage += km;
        totalCompanyMileage += km;
    }
    public static void printFleetSummary(){
        System.out.println(totalCars + " " + totalCompanyMileage);
    }



}
