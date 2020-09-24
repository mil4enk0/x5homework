package homeworks.homework5.task2.components.abstractComponents;

import homeworks.homework5.task2.components.abstractComponents.ComputerComponent;

public abstract class Processor extends ComputerComponent {
    private double clockFrequency;
    private int coresQuantity;
    private int cashMemory;
    private String name;
    private String manufacturer;

    public Processor(double clockFrequency, int coresQuantity, int cashMemory, String name, String manufacturer) {
        this.clockFrequency = clockFrequency;
        this.coresQuantity = coresQuantity;
        this.cashMemory = cashMemory;
        this.name = name;
        this.manufacturer = manufacturer;
    }

    public void turnOn() {
        System.out.println("Процессор запущен");
    }
}
