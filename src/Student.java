import java.util.ArrayList;
import java.util.List;

public class Student implements Comparable <Student>{
    // поля
    private String name;
    private List<Integer> grades;

    // свойства
    public String getName()
    {
        return this.name;
    };

    public List<Integer> getGrades() {
        return this.grades;
    }

    // конструкторы
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // методы
    public String toString() {
        String s = name + ": ";
        if (grades.size() > 0) {
            for (int i = 0; i < this.grades.size() - 1; i++) {
                s = s + this.grades.get(i) + ", ";
            }
            s = s + this.grades.get(grades.size() - 1);
        } else {
            s = s + "оценок нет.";
        }
        return s;
    }
    //вставка оценки
    public void addGrade(int grade) {
        if (grade >= 2 && grade <= 5) {
            grades.add(grade);
        } else {
            throw new IllegalArgumentException("Оценка должна быть в диапазоне от 2 до 5");
        }
    }
    //значение средней оценки
    public double getAverageGrades() {
        if (this.grades.size() == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < this.grades.size(); i++) {
            sum = sum + this.grades.get(i);
        }
        return ((double) sum/this.grades.size());
    }
    //возвращение информации о том, является ли студент отличником или нет
    public String excellentStudent() {
        if (this.grades.size() == 0) {
            return "Не отличник";
        }
        for (int grade : grades) {
            if (grade != 5) {
                return "Не отличник";
            }
        }
        return "Отличник";
    }
    //метод “сравнить”
    @Override
    public int compare(Student obj) {
       if (this.getAverageGrades() > obj.getAverageGrades()) return 1;
       if (this.getAverageGrades() < obj.getAverageGrades()) return -1;
       return 0;
    };
}