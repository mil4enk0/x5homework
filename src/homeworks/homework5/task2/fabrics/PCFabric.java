package homeworks.homework5.task2.fabrics;

import homeworks.homework5.task2.components.StorageTypes;
import homeworks.homework5.task2.components.pcComponents.PCGraphicsCard;
import homeworks.homework5.task2.components.pcComponents.PCProcessor;
import homeworks.homework5.task2.components.pcComponents.PCRAM;
import homeworks.homework5.task2.components.pcComponents.PCStorage;
import homeworks.homework5.task2.computers.PC;

public class PCFabric extends ComputerFabric {

    @Override
    public PC getComputer() {
        return new PC(getPCProcessor(), getPCRAM(), getPCGraphicsCard(), getPCStorage());
    }

    private PCProcessor getPCProcessor() {
        return new PCProcessor(2.5, 8, 1000, "Процессор 1", "Китай");
    }

    private PCRAM getPCRAM() {
        return new PCRAM(2.8, 512, "быстрая", "Корея");
    }

    private PCGraphicsCard getPCGraphicsCard() {
        return new PCGraphicsCard(true, 1024, "полноценная", "Китай");
    }

    private PCStorage getPCStorage() {
        return new PCStorage("хороший", 500, StorageTypes.HDD, "Япония");
    }
}
