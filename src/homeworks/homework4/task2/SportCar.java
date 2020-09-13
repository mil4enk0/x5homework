package homeworks.homework4.task2;

public class SportCar extends Car{

    SportCar(String mark, String carClass, double weight, Engine engine) {
        super(mark, carClass, weight, engine);
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

    }
}
