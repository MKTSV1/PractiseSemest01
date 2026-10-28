package semestr1.practise08;

public class Employee {
    private String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        this.name = name;
        return name;
    }
    @Override public String toString() {
    return String.format("Ім'я = %s | Зарплатня = %.2f |", name, salary);
    }
}
