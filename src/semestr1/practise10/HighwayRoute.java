package semestr1.practise10;

public class HighwayRoute implements Measurable{
    private double length;
    public HighwayRoute(double length){
        this.length =length;
    }
    @Override
    public double getMeasure() {
        return length;
    }
}
