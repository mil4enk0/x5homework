package homeworks.homework2.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите целое трёхзначное число:");
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        if ((value.length() > 3)) {
            System.out.println("Введённое число должно быть трёхзначным!");
            scanner.close();
            return;
        }
        String[] array = value.split("");
        int sum = 0;
        for (int i = 0; i < value.length(); i++) {
            sum += Integer.parseInt(array[i]);
        }
        scanner.close();
        System.out.println("Сумма цифр числа: " + sum);
    }
}
