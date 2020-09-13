package homeworks.homework4.task2;

public class Lorry extends Car {

    Lorry(String mark, String carClass, double weight, Engine engine) {
        super(mark, carClass, weight, engine);
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

    }
}
