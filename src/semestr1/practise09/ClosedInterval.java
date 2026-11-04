package semestr1.practise09;

public class ClosedInterval {
private double start;
private double end;
public ClosedInterval(double start, double end){
    this.start = start;
    this.end = end;
    if (start > end){
        this.start = end;
        this.end = start;
    }
}
public void resize(double newStart,double newEnd){
    this.start = newStart;
    this.end = newEnd;
    if (newStart > newEnd){
        this.start = newEnd;
        this.end = newStart;
    }
}
public double getLength(){
    return  end - start;
}
public double getMidpoint(){
    return (this.end + this.start) / 2.0;
}
public boolean overlaps(ClosedInterval other){
    return this.start <= other.end && this.end >= other.start;}
@Override public String toString(){
    return String.format("Початок інтервалу = %.2f | Кінець інтервалу = %.2f |" +
            " Довжина інтервалу = %.2f | Середина інтервалу = %.2f |",start,end, getLength(),getMidpoint());
}
}
