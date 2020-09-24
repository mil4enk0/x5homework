package homeworks.homework5.task2.fabrics;

import homeworks.homework5.task2.components.StorageTypes;
import homeworks.homework5.task2.components.notebookComponents.NotebookGraphicsCard;
import homeworks.homework5.task2.components.notebookComponents.NotebookProcessor;
import homeworks.homework5.task2.components.notebookComponents.NotebookRAM;
import homeworks.homework5.task2.components.notebookComponents.NotebookStorage;
import homeworks.homework5.task2.computers.Notebook;

public class NotebookFabric extends ComputerFabric {

    @Override
    public Notebook getComputer() {
        return new Notebook(getNotebookProcessor(), getNotebookRAM(), getNotebookGraphicsCard(), getNotebookStorage());
    }

    private NotebookProcessor getNotebookProcessor() {
        return new NotebookProcessor(2.5, 9, 2000, "Процессор 2", "Китай");
    }

    private NotebookRAM getNotebookRAM() {
        return new NotebookRAM(2.8, 512, "медленная", "Корея");
    }

    private NotebookGraphicsCard getNotebookGraphicsCard() {
        return new NotebookGraphicsCard(true, 1024, "неполноценная", "Китай");
    }

    private NotebookStorage getNotebookStorage() {
        return new NotebookStorage("плохой", 1000, StorageTypes.SSD, "Япония");
    }
}
