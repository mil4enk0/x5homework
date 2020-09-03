package homeworks.homework2.task1;

import java.util.Scanner;

public class Task1Starter {
    public static void main(String[] args) {
        System.out.println("Введите целое число:");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        System.out.println(value % 10);
        scanner.close();
    }
}
