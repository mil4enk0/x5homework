package homeworks.homework2.task7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Введите код города:");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        scanner.close();
        int callCost = 10;
        String city;
        double tariff;
        if (value == 905) {
            city = "Москва";
            tariff = 4.15;
        } else if (value == 194) {
            city = "Ростов";
            tariff = 1.98;
        } else if (value == 491) {
            city = "Краснодар";
            tariff = 2.69;
        } else if (value == 800) {
            city = "Киров";
            tariff = 5.0;
        } else {
            System.out.println("Неизвестный код города!");
            return;
        }
        System.out.println(city + ". Стоимость разговора: " + tariff * callCost);
    }
}
