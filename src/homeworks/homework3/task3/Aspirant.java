package homeworks.homework3.task3;

public class Aspirant extends Student {

    private String researchName;

    Aspirant(String firstName, String lastName, String group, double avgMark) {
        super(firstName, lastName, group, avgMark);
    }

    @Override
    public int getScholarship() {
        return avgMark == 5 ? 200 : 180;
    }
}

