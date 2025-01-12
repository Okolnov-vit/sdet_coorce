import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import Classes.Student;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();


        students.add(new Student("Иванов Иван", "Группа 1", 1, Arrays.asList(4.5, 5.0, 3.5)));
        students.add(new Student("Петров Петр", "Группа 2", 2, Arrays.asList(2.0, 2.5, 3.0)));
        students.add(new Student("Сидоров Сидор", "Группа 3", 1, Arrays.asList(4.0, 4.5, 3.0)));
        students.add(new Student("Кузнецова Анна", "Группа 2", 2, Arrays.asList(5.0, 4.0, 5.0)));


        Student.removeLowAverageStudents(students);


        System.out.println("Студенты на 2 курсе:");
        Student.printStudents(students, 2);


        System.out.println("Студенты на 3 курсе:");
        Student.printStudents(students, 3);
    }
}