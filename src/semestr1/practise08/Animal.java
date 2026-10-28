package semestr1.practise08;

public class Animal {
    private String name;
    private int age;
    private double weight;
    public Animal(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getWeight(){
        return weight;
    }
    @Override
    public String toString() {
        return String.format("Ім'я = %s, вік = %d, вага = %.1f", name, age, weight);
    }
}
