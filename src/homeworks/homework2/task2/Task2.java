package homeworks.homework2.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите целое трёхзначное число:");
        Scanner scanner = new Scanner(System.in);
        int value = Math.abs(scanner.nextInt());
        if (!(value > 99 && value < 999)) {
            System.out.println("Введённое число должно быть трёхзначным!");
            scanner.close();
            return;
        }
        int a = value / 100;
        int b = value % 100 / 10;
        int c = value % 10;
        System.out.println(a + b + c);
        scanner.close();
    }
}
