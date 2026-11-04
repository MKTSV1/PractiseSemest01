package semestr1.practise09;

public class SmartDevice {
    private final Battery battery;
    private final Display display;
    public SmartDevice(Battery battery, Display display){
        this.battery = battery;
        this.display = display;
    }
    public void watchVideo(int minutes){
    if (display.getBrightnessPercent() > 70){
        battery.drain(2 * minutes / 10);
    }else{
        battery.drain(1 * minutes / 10);
    }
        if (battery.getChargePercent() == 0) {
            System.out.println("Пристрій вимкнувся: заряд батареї 0%");
        }
    }
}
