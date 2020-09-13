package homeworks.homework3.task2;

public class Dog extends Animal {

    private double borkVolume;

    Dog(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("Bork-bork! Bork-bork-bork!");
    }

    @Override
    public void eat() {
        System.out.print("Dog ");
        super.eat();
    }

    @Override
    public void sleep() {
        System.out.println("Dog going to sleep");
    }
}
