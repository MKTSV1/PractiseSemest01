package semestr1.practise08;

public class Dog extends Animal{
    private String breed;
    public Dog(String name, int age, double weight){
        super(name,age,weight);
    }
    public String fetchStick(){
    return "Приніс палку";
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" %s",fetchStick());
    }
}
