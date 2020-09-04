package homeworks.homework2.task5;

import java.util.Scanner;

public class Task5 {
        public static void main(String[]args) {
        System.out.println("Введите первое целое число:");
        Scanner scanner = new Scanner(System.in);
        int valueFirst = scanner.nextInt();
        System.out.println("Введите второе целое число:");
        int valueSecond = scanner.nextInt();
        System.out.println("Введите третье целое число:");
        int valueThird = scanner.nextInt();
        int[] values = {valueFirst, valueSecond, valueThird};
        int minValue = findMinValue(values);
        System.out.println("Минимальное число из введённых:" + minValue);
        scanner.close();
    }

        private static int findMinValue(int[] array) {
            int min = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] < min)
                    min = array[i];
            }
            return min;
        }
}




