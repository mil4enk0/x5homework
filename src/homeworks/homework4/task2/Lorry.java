package homeworks.homework4.task2;

public class Lorry extends Car {

    private double liftingCapacity;

    public Lorry(String mark, String carClass, double weight, Engine engine, double liftingCapacity) {
        super(mark, carClass, weight, engine);
        this.liftingCapacity = liftingCapacity;
    }

    @Override
    public void start() {
        System.out.println("Грузовик поехал");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик остановился");
    }

    @Override
    public void printInfo() {
        System.out.println("Информация о грузовике: " + getMark() + ", " + getCarClass() +
                ", " + getEngine() + ", " + getWeight() + ", " + liftingCapacity);
    }
}
