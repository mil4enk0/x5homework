package homeworks.homework3.task3;

public class Student {

    private String firstName;
    private String lastName;
    private String group;
    private double avgMark;

    public Student(String firstName, String lastName, String group, double avgMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.avgMark = avgMark;
    }

    public int getScholarship() {
        return avgMark == 5 ? 100 : 80;
    }

    public double getAvgMark() {
        return avgMark;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
