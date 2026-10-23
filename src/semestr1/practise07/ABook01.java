package semestr1.practise07;

public class ABook01 {
    private String title;
    private String author;
    private int year;
    private double price;
    public ABook01(){
        this.title = "Невідомо";
        this.author = "Невідомий";
        this.year = 2000;
        this.price = 0.0;
    }
    public ABook01(String title, String author, int year, double price){
        this.title = title;
        this.year = year;
        this.author = author;
        this.price = price;
        if (this.year <= 0 ){
            this.year = 2000;
        }
        if (this.price <= 0){
            this.price = 0.0;
        }
    }
    public void printInfo(){
        System.out.println("Книга з назвою \"" + title + "\" Написана " + author + " у " + year +
                " році коштує " + price + " гривень");
    }
}
