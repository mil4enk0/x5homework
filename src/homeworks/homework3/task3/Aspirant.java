package homeworks.homework3.task3;

public class Aspirant extends Student {

    private String researchName;

    public Aspirant(String researchName, String firstName, String lastName, String group, double avgMark) {
        super(firstName, lastName, group, avgMark);
        this.researchName = researchName;
    }

    @Override
    public int getScholarship() {
        return getAvgMark() == 5 ? 200 : 180;
    }
}

