package homeworks.homework5.task2.components.pcComponents;

import homeworks.homework5.task2.components.StorageTypes;
import homeworks.homework5.task2.components.abstractComponents.Storage;

public class PCStorage extends Storage {

    public PCStorage(String formFactor, int storageVolume, StorageTypes type, String manufacturer) {
        super(formFactor, storageVolume, type, manufacturer);
    }
}
