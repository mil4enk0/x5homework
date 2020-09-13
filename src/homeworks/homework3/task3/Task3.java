package homeworks.homework3.task3;

public class Task3 {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Семён", "Сёмкин", "12SS1", 4.6),
                new Student("Борис", "Борькин", "12SS2", 5),
                new Aspirant("Антон", "Тошкин", "12SS3", 5)
        };
        for (Student student: students) {
            System.out.println(student.firstName + " " + student.lastName + " " + student.getScholarship());
        }
    }
}
