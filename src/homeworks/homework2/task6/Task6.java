package homeworks.homework2.task6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Введите целое число:");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        System.out.print(value + " - ");
        if (value == 0) {
            System.out.print("нулевое число");
            return;
        }
        if (value < 0) {
            System.out.print("отрицательное ");
        } else {
            System.out.print("положительное ");
        }
        if (value % 2 == 0) {
            System.out.print("чётное число");
        } else {
            System.out.print("нечётное число");
        }
        scanner.close();
    }
}
