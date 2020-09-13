package homeworks.homework4.task1;

public class Triangle implements Shape {

    private double a;
    private double h;

    Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public double getH() {
        return h;
    }

    @Override
    public double square() {
        return this.a * this.h / 2;
    }
}
