package homeworks.homework5.task2.components.notebookComponents;

import homeworks.homework5.task2.components.StorageTypes;
import homeworks.homework5.task2.components.abstractComponents.Storage;

public class NotebookStorage extends Storage {

    public NotebookStorage(String formFactor, int storageVolume, StorageTypes type, String manufacturer) {
        super(formFactor, storageVolume, type, manufacturer);
    }
}
