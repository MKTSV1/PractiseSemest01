package semestr1.practise07;

public class EProduct05 {
    private String name;
    private double price;
    private int quantity;
    private String category;
    private double applyDiscount;
    public EProduct05(String name, double price, int quantity, String category){
        this.name = name;
        this.price =price;
        this.quantity = quantity;
        this.category = category;
    }
    public double getTotalValue(){
        return price * quantity;
    }
    public void applyDiscount(){
        applyDiscount = price * 1;
    }
    public void applyDiscount(double percent){
        if (percent < 0 || percent >100){
            System.out.println("Помилка, відсоток винен бути від 0 до 100");
            percent = 100;
        }
        applyDiscount = getTotalValue() - ( getTotalValue() * percent / 100);
    }
    public void printProduct(){
        System.out.println("-----------------------------------");
        System.out.println("                  Картка товару");
        System.out.println("Назва товару                   " + name);
        System.out.println("Початкова ціна товару          " + price);
        System.out.println("Кількість товару               " + quantity);
        System.out.println("Категорія товару               " + category);
        System.out.println("Ціна товарів                   " + getTotalValue());
        System.out.println("Всього до сплати               " + applyDiscount);
        System.out.println("-----------------------------------");
    }
}
