package semestr1.practise08;

public class Product {
    private String sku;
    private String title;
    private double price;
    private int stock;
    public Product(String sku,String title,double price, int stock){
    this.sku = sku;
    this.title = title;
    this.price = price;
    this.stock = stock;
        if (price < 0.0 ){
            System.out.println("Помилка");
            this.price =1;
        }
        if (stock < 0){
            System.out.println("Помилка");
            this.stock = 1;
        }
    }
    public double setPrice(double price){
        this.price = price;
        return price;
    }
    public int setStock(int stock){
        this.stock = stock;
        return stock;
    }
    public double getTotalCost(){
        return price * stock;
    }
    @Override public String toString(){
        return String.format("[SKU: %s ]%s | Ціна: %.2f грн | Залишок: %d шт. | Разом:%.2f",sku,title,price,stock,getTotalCost());
    }
}
