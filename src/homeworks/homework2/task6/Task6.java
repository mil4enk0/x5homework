package homeworks.homework2.task6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Введите целое число:");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if (value < 0 && (value % 2) != 0) {
            System.out.println(value + " - отрицательное нечётное число");
        }
        else if (value < 0 && (value % 2) == 0) {
            System.out.println(value + " - отрицательное чётное число");
        }
        else if (value == 0) {
            System.out.println(value + " - нулевое число");
        }
        else if (value > 0 && (value % 2) != 0) {
            System.out.println(value + "- положительное нечётное число");
        }
        else if (value > 0 && (value % 2) == 0) {
            System.out.println(value + " - положительное чётное число");
        }
        scanner.close();
    }
}
