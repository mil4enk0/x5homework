package homeworks.homework2.task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите целое число:");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if (value > 0) {
            value = value + 1;
        }
        System.out.println(value);
    }
}
