package homeworks.homework3.task2;

public class Cat extends Animal {

    private double avgMeowsPerMin;

    Cat(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow-meow-meow...");
    }

    @Override
    public void eat() {
        System.out.print("Cat ");
        super.eat();

    }

    @Override
    public void sleep() {
        System.out.println("Cat going to sleep");
    }
}
