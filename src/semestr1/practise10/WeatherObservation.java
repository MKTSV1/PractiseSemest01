package semestr1.practise10;

public class WeatherObservation implements DataExportable{
    private String city;
    private double tempC;
    private int humidity;
    public WeatherObservation(String city,double tempC,int humidity){
        this.city=city;
        this.tempC=tempC;
        this.humidity=humidity;
    }
    @Override
    public String toJson() {
        return String.format("Джейсон файл | %s | %.2f | %d",city,tempC,humidity);

    }

    @Override
    public String toCsvRow() {
        return String.format("Цісіві файл | %s | %.2f | %d",city,tempC,humidity);
    }
}
