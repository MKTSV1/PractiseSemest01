package semestr1.practise08;

public class Student {
    private String name;
    private int course;
    private double gpa;
    public Student(String name,int course,double gpa){
        this.course = course;
        this.name = name;
        this.gpa = gpa;
        if (course <1 || course >6){
            this.course =1;
        }
        if (gpa < 0.0 || gpa > 100.0){
            this.gpa = 60.0;
        }
    }
    public String getName(){
        return name;
    }
    public int getCourse(){
        return course;
    }
    public double getGpa(){
        return gpa;
    }
@Override public String toString(){
        return "Student{name =" + name + " , course= " + course + ", gpa= " + gpa + "}";
}
}
