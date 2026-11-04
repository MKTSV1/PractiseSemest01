package semestr1.practise09;

public class Engine {
    private final String fuelType;
    private final int volumeCc;
    private int rpm;
    private boolean started;
    public Engine(String fuelType,int volumeCc, int rpm, boolean started){
        this.fuelType =fuelType;
        this.volumeCc = volumeCc;
        this.rpm = rpm;
        this.started =started;
    }
    public boolean isStarted(){
        return started;
    }
    public boolean isStopped(){
        return started;
    }
    public void stop(){
        this.started = false;
    }
    public void start(){
        this.started = true;
    }
    public void setRpm(int rpm){
        this.rpm = rpm;
    }

    @Override
    public String toString() {
        return String.format("Тип пального = %s | Об'єм двигуна = %d |" +
                " Швидкість оборотів = %d | Чи їде? %b",fuelType,volumeCc,rpm,started);
    }
}
