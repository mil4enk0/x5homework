package homeworks.homework3.task2;

public class Animal {

    protected String food;
    protected String location;

    Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
    }

    public void eat() {
        System.out.println("eating " + food);
    }

    public void sleep() {
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }
}
