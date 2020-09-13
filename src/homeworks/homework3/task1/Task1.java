package homeworks.homework3.task1;

public class Task1 {
    public static void main(String[] args) {
        Phone phoneFirst = new Phone("8-987-111-11-11", "Samsung", 1.1);
        Phone phoneSecond = new Phone("8-987-222-22-22", "IPhone", 2.2);
        Phone phoneThird = new Phone("8-987-333-33-33", "Xiaomi", 3.3);
        System.out.println(" Сведения о телефонах: \n Номер телефона Модель  Вес \n"
                + phoneFirst.getNumber() + " " + phoneFirst.getModel() + " " + phoneFirst.getWeight()
                + "\n" + phoneSecond.getNumber() + " " + phoneSecond.getModel() + "  " + phoneSecond.getWeight()
                + "\n" + phoneThird.getNumber() + " " + phoneThird.getModel() + "  " + phoneThird.getWeight());
        phoneFirst.receiveCall("Ольга");
        phoneSecond.receiveCall("Светлана");
        phoneThird.receiveCall("Анна");
        phoneThird.receiveCall("Анна", "8-987-444-44-44");
    }
}
