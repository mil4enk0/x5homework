package homeworks.homework4.task2;

public abstract class Car {

    protected String mark;
    protected String carClass;
    protected double weight;
    protected Engine engine;

    public Car(String mark, String carClass, double weight, Engine engine) {
        this.mark = mark;
        this.carClass = carClass;
        this.weight = weight;
        this.engine = engine;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getMark() {
        return mark;
    }

    public String getCarClass() {
        return carClass;
    }

    public double getWeight() {
        return weight;
    }

    public Engine getEngine() {
        return engine;
    }

    public abstract void start();

    public abstract void stop();

    public abstract void printInfo();

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }
}
