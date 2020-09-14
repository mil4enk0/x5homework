package homeworks.homework4.task1;

public class Circle implements Shape {

    private double r;

    Circle(double r) {
        this.r = r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    @Override
    public double square() {
        return Math.PI * Math.pow(r, 2);
    }
}
