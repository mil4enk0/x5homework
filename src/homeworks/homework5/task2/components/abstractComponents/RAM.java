package homeworks.homework5.task2.components.abstractComponents;

import homeworks.homework5.task2.components.abstractComponents.ComputerComponent;

public abstract class RAM extends ComputerComponent {
    private double frequency;
    private int memoryVolume;
    private String type;
    private String manufacturer;

    public RAM(double frequency, int memoryVolume, String type, String manufacturer) {
        this.frequency = frequency;
        this.memoryVolume = memoryVolume;
        this.type = type;
        this.manufacturer = manufacturer;
    }

    public void turnOn() {
        System.out.println("Оперативная память работает");
    }
}
