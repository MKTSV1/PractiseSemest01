package semestr1.practise09;

public class ParcelOrder {
    private final String orderId;
    private double weightKg;
    private DeliveryAddress destination;
    private boolean shipped;
    public ParcelOrder(String orderId,double weightKg, DeliveryAddress destination, boolean shipped){
        this.orderId =orderId;
        this.weightKg=weightKg;
        this.destination=destination;
        this.shipped=shipped;
    }
    public void markAsShipped(){
        this.shipped=true;
    }
    public void changeDestination(DeliveryAddress newAddress){
        if (!shipped){
            destination = newAddress;
        }else {
            System.out.println("❌ Помилка: Замовлення вже відправлено! Зміна адреси неможлива.");
        }
    }
    @Override
    public String toString() {
        return String.format("Замовлення: %s | Вага: %.2f кг | Відправлено: %b\nАдреса доставки: [%s]",
                orderId, weightKg, shipped, destination.toString());
    }
}
