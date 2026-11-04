package semestr1.practise10;

public class StudentGradeRecord implements DataExportable{
    private String name;
    private int group;
    private double gpa;
    public StudentGradeRecord(String name, int group, double gpa){
        this.name=name;
        this.group=group;
        this.gpa=gpa;
    }
    @Override
    public String toJson() {
        return String.format("Джейсон файл | %s | %d | %.2f",name,group,gpa);
    }

    @Override
    public String toCsvRow() {
        return String.format("Цісіві файл | %s | %d | %.2f",name,group,gpa);
    }
}