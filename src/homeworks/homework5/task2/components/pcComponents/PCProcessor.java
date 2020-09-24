package homeworks.homework5.task2.components.pcComponents;

import homeworks.homework5.task2.components.abstractComponents.Processor;

public class PCProcessor extends Processor {

    public PCProcessor(double clockFrequency, int coresQuantity, int cashMemory, String name, String manufacturer) {
        super(clockFrequency, coresQuantity, cashMemory, name, manufacturer);
    }
}
