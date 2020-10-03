package homeworks.homework6.task2;

public abstract class Fruit {

    public abstract double getWeight();

    @Override
    public String toString() {
        return String.valueOf(getWeight());
    }
}
