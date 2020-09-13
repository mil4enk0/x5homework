package homeworks.homework3.task2;

public class Horse extends Animal {

    private boolean shod;

    Horse(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("Neeeeiiighh!");
    }

    @Override
    public void eat() {
        System.out.print("Horse ");
        super.eat();
    }

    @Override
    public void sleep() {
        System.out.println("Horse going to sleep");
    }
}
