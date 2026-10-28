package semestr1.practise08;

public class Medicine {
    private String name;
    private double price;
    private boolean isExpired;
    public Medicine(String name, double price, boolean isExpired){
        this.name = name;
        this.price = price;
        this.isExpired  = isExpired;
    }

    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }

    public boolean getIsExpired() {
        return isExpired;
    }

    @Override
    public String toString() {
        return String.format("Препарат = %s | Ціна = %.2f | Чи можна вжити? %b",name,price,isExpired);
    }
}
