package homeworks.homework3.task2;

public class Task2 {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("sugar bone", "bork house"),
                new Cat("fresh milk", "soft bed"),
                new Horse("tasty carrot", "cozy stable")
        };
        Veterinarian veterinarian = new Veterinarian();
        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }
    }
}
