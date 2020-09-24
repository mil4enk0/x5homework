package homeworks.homework5.task2.components.notebookComponents;

import homeworks.homework5.task2.components.abstractComponents.Processor;

public class NotebookProcessor extends Processor {

    public NotebookProcessor(double clockFrequency, int coresQuantity, int cashMemory, String name, String manufacturer) {
        super(clockFrequency, coresQuantity, cashMemory, name, manufacturer);
    }
}
