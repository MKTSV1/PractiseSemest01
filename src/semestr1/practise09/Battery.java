package semestr1.practise09;

public class Battery {
    private int capacityMah;
    private int chargePercent;
    public Battery(int capacityMah,int chargePercent){
        this.capacityMah = capacityMah;
        this.chargePercent = Math.max(0,Math.min(100,chargePercent));
    }
public void drain(int percent){
        this.chargePercent -= percent;
}
public void charge(int percent){
        this.chargePercent += percent;
}
public int getChargePercent(){
        return chargePercent;
}
    @Override
    public String toString() {
        return String.format("Міліампер = %d | Відсотків живлення = %d%%",capacityMah,chargePercent);
    }
}
