package homeworks.homework2.task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int k = 1;
        Scanner scanner = new Scanner(System.in);
        String exitValue = "\"end\"";
        System.out.println("Введите число через Enter. Для завершения ввода напишите " + exitValue);
        int minValue = 0;
        String currentValue;
        while (!(currentValue = scanner.nextLine()).equals(exitValue)) {
            if (k++ == 1) {
                minValue = Integer.parseInt(currentValue);
                continue;
            }
            if (minValue > Integer.parseInt(currentValue)) {
                minValue = Integer.parseInt(currentValue);
            }
        }
        System.out.println(minValue);
    }
}




