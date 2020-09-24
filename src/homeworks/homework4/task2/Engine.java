package homeworks.homework4.task2;

public class Engine {

    private String power;
    private String manufacturer;

    public Engine(String power, String manufacturer) {
        this.power = power;
        this.manufacturer = manufacturer;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPower() {
        return power;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
