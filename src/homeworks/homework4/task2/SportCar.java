package homeworks.homework4.task2;

public class SportCar extends Car {

    private double speedLimit;

    public SportCar(String mark, String carClass, double weight, Engine engine, double speedLimit) {
        super(mark, carClass, weight, engine);
        this.speedLimit = speedLimit;
    }

    @Override
    public void start() {
        System.out.println("SportCar поехал");
    }

    @Override
    public void stop() {
        System.out.println("SportCar становился");
    }

    @Override
    public void printInfo() {
        System.out.println("Информация о спорткаре: " + getMark() + ", " + getCarClass() +
                ", " + getEngine() + ", " + getWeight() + ", " + speedLimit);
    }
}
