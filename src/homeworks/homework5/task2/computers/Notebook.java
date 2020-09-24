package homeworks.homework5.task2.computers;

import homeworks.homework5.task2.components.notebookComponents.NotebookGraphicsCard;
import homeworks.homework5.task2.components.notebookComponents.NotebookProcessor;
import homeworks.homework5.task2.components.notebookComponents.NotebookRAM;
import homeworks.homework5.task2.components.notebookComponents.NotebookStorage;

public class Notebook extends Computer {

    public Notebook(NotebookProcessor processor, NotebookRAM ram, NotebookGraphicsCard graphicsCard, NotebookStorage storage) {
        super(processor, ram, graphicsCard, storage);
    }
}
