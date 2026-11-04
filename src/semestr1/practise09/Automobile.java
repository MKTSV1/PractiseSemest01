package semestr1.practise09;

public class Automobile {
    private final String model;
    private double speed;
    private final Engine engine;
    public Automobile(String model,double speed, Engine engine){
        this.model = model;
        this.speed = speed;
        this.engine =engine;
    }
    public void accelerate(double deltaSpeed){
        if (engine.isStarted()){
            this.speed +=deltaSpeed;
            engine.setRpm((int) (this.speed * 50));
        }else {
            System.out.println("Неможливо розігнатися: двигун не заведений!");
        }
    }

    @Override
    public String toString() {
        return String.format("Модель = %s | Швидкість = %.2f |",model,speed) + engine;
    }
}
