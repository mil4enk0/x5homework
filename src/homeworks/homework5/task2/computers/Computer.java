package homeworks.homework5.task2.computers;

import homeworks.homework5.task2.components.abstractComponents.GraphicsCard;
import homeworks.homework5.task2.components.abstractComponents.Processor;
import homeworks.homework5.task2.components.abstractComponents.RAM;
import homeworks.homework5.task2.components.abstractComponents.Storage;

public class Computer {
    private Processor processor;
    private RAM ram;
    private GraphicsCard graphicsCard;
    private Storage storage;

    public Computer(Processor processor, RAM ram, GraphicsCard graphicsCard, Storage storage) {
        this.processor = processor;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
        this.storage = storage;
    }

    public void turnOn() {
        System.out.println("Начинаем запуск компьютера: ");
        processor.turnOn();
        ram.turnOn();
        graphicsCard.turnOn();
        storage.turnOn();
        System.out.println("Компьютер запущен");
    }
}
