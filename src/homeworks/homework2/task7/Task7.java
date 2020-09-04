package homeworks.homework2.task7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Введите код города:");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        scanner.close();
        if (value == 905) {
            System.out.println("Москва. Стоимость разговора: " + 4.15 * 10);
        }
        else if (value == 194) {
            System.out.println("Ростов. Стоимость разговора: " + 1.98 * 10);
        }
        else if (value == 491) {
            System.out.println("Краснодар. Стоимость разговора: " + 2.69 * 10);
        }
        else if (value == 800) {
            System.out.println("Киров. Стоимость разговора: " + 5.0 * 10);
        }
        else {
            System.out.println("Неизвестный код города!");
        }
    }
}
