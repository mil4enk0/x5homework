package homeworks.homework5.task2.computers;

import homeworks.homework5.task2.components.pcComponents.PCGraphicsCard;
import homeworks.homework5.task2.components.pcComponents.PCProcessor;
import homeworks.homework5.task2.components.pcComponents.PCRAM;
import homeworks.homework5.task2.components.pcComponents.PCStorage;

public class PC extends Computer {

    public PC(PCProcessor processor, PCRAM ram, PCGraphicsCard graphicsCard, PCStorage storage) {
        super(processor, ram, graphicsCard, storage);
    }
}
