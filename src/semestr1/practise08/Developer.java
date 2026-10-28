package semestr1.practise08;

public class Developer extends Employee {
        private String programmingLanguage;

        public Developer(String name, double salary, String programmingLanguage) {
            super(name, salary);
            this.programmingLanguage = programmingLanguage;
        }
        @Override public String toString(){
            return String.format("Ім'я = %s | Зарплатня = %.2f |Мова програмування = %s", getName(),salary,programmingLanguage);
        }
    }
