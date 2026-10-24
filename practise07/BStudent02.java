package semestr1.practise07;

public class BStudent02 {
    private String name;
    private int age;
    private double gpa;
    public BStudent02(String name, int age, double gpa){
       this.age = age;
       this.gpa = gpa;
        this.name = name;
        if (age < 15 || age > 80){
            this.age = 18;
        }
        if (gpa < 0.0 || gpa > 5.0){
            this.gpa = 0.0;
        }
    }
    public boolean isHonorStudent(){
        return this.gpa >= 4.5;
    }
    public void printStudent(){
        System.out.println("Студент " + name + "\nРоків " + age + "\nСередній бал " + gpa);
        if (isHonorStudent()){
            System.out.println("Відмінник");
        }else{
            System.out.println("Звичайний студент");
        }
        System.out.println();
    }
}
