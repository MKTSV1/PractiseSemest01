package semestr1.practise10;

public class CpuCore implements Measurable{
    private double gerz;
    public CpuCore(double gerz){
        this.gerz =gerz;
    }
    @Override
    public double getMeasure() {
        return gerz;
    }
}
