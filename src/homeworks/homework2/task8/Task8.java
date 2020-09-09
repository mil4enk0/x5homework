package homeworks.homework2.task8;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        int[] values = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        String intValuesString = Arrays.toString(values);
        System.out.println("Массив чисел: " + intValuesString);
        int maxValue = values[0];
        int positiveNumbersSum = 0;
        int evenNegativeNumbersSum = 0;
        int positiveNumbersQuantity = 0;
        int negativeNumbersSum = 0;
        int negativeNumbersQuantity = 0;
        for (int i = 0; i < values.length; i++) {
            if (maxValue < values[i]) {
                maxValue = values[i];
            }
            if (values[i] > 0) {
                positiveNumbersSum += values[i];
                positiveNumbersQuantity += 1;
            } else if (values[i] < 0) {
                if (values[i] % 2 == 0) {
                    evenNegativeNumbersSum += values[i];
                }
                negativeNumbersSum += values[i];
                negativeNumbersQuantity += 1;
            }
        }
        System.out.println("Максимально число данного массива: " + maxValue);
        System.out.println("Сумма положительных чисел данного массива: " + positiveNumbersSum);
        System.out.println("Сумма отрицательных чётных чисел данного массива: " + evenNegativeNumbersSum);
        System.out.println("Количество положительных чисел данного массива: " + positiveNumbersQuantity);
        System.out.println("Среднее арифметическое отрицательных чисел данного массива: "
                + (double) negativeNumbersSum / negativeNumbersQuantity);
    }
}

