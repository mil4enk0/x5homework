package homeworks.homework5.task2.components.abstractComponents;

import homeworks.homework5.task2.components.abstractComponents.ComputerComponent;

public abstract class GraphicsCard extends ComputerComponent {
    private boolean activeCooling;
    private int cardVolume;
    private String type;
    private String manufacturer;

    public GraphicsCard(boolean activeCooling, int cardVolume, String type, String manufacturer) {
        this.activeCooling = activeCooling;
        this.cardVolume = cardVolume;
        this.type = type;
        this.manufacturer = manufacturer;
    }

    public void turnOn() {
        System.out.println("Графическая карта включена");
    }
}
