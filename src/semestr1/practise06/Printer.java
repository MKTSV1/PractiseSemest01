package semestr1.practise06;

public class Printer {
    public String model;
    public int paperCount;

    public void printDocument(String title, int pages) {
    if (paperCount > pages){
        paperCount = paperCount- pages;
        System.out.println("Успішний друк");
    }else{
        System.out.println("Помилка: Недостатньо паперу в принтері " + model + "!");
    }
    }
}