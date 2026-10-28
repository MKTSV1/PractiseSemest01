package semestr1.practise08;

public class Cat extends Animal{
    private boolean isIndoor;
    public Cat(String name, int age, double weight){
        super(name,age,weight);
    }
    public String purr(){
        return  "Мяу";
    }
    @Override
    public String toString() {
        return super.toString() + String.format(" %s",purr());
    }
}
