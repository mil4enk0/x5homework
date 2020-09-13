package homeworks.homework3.task3;

public class Student {

    protected String firstName;
    protected String lastName;
    protected String group;
    protected double avgMark;

    Student(String firstName, String lastName, String group, double avgMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.avgMark = avgMark;
    }

    public int getScholarship() {
        return avgMark == 5 ? 100 : 80;
    }
}
