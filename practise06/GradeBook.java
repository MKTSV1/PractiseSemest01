package semestr1.practise06;

public class GradeBook {
    private String studentName;
    private int[] grades;
    public void setData(String name, int[] g){
    this.studentName = name;
    this.grades = g;
    }
    public double getAverage(){
        double sum = 0.0;
        for (int i = 0; i < grades.length; i++) {
           sum += grades[i];
        }
        return sum / grades.length;
    }
    public int getHighestGrade(){
        int maxValue = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (maxValue < grades[i]){
                maxValue = grades[i];
            }
        }
        return  maxValue;
    }
    public int getLowestGrade(){
        int minValue = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (minValue > grades[i]){
                minValue = grades[i];
            }
        }
        return  minValue;
    }
}
