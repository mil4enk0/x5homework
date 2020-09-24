package homeworks.homework5.task2.components.abstractComponents;

import homeworks.homework5.task2.components.StorageTypes;
import homeworks.homework5.task2.components.abstractComponents.ComputerComponent;

public abstract class Storage extends ComputerComponent {
    private String formFactor;
    private int storageVolume;
    private StorageTypes type;
    private String manufacturer;

    public Storage(String formFactor, int storageVolume, StorageTypes type, String manufacturer) {
        this.formFactor = formFactor;
        this.storageVolume = storageVolume;
        this.type = type;
        this.manufacturer = manufacturer;
    }

    public void turnOn() {
        System.out.println("Накопитель включен. Характеристики: " + formFactor + ", " + storageVolume +
                ", " + type + ", " + manufacturer);
    }
}
