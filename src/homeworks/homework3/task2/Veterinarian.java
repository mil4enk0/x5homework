package homeworks.homework3.task2;

public class Veterinarian {

    public void treatAnimal(Animal animal) {
        animal.eat();
        System.out.println("Animal location is " + animal.getLocation() + "\n");
    }
}
