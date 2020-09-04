package homeworks.homework2.task8;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        int[] values = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        String intValuesString = Arrays.toString(values);
        System.out.println("Массив чисел: " + intValuesString);
        System.out.println("Максимально число данного массива: " + findMaxValue(values));
        System.out.println("Сумма положительных чисел данного массива: " + findPositiveNumbersSum(values));
        System.out.println("Сумма отрицательных чётных чисел данного массива: " + findEvenNegativeNumbersSum(values));
        System.out.println("Количество положительных чисел данного массива: " + findPositiveNumbersQuantity(values));
        System.out.println("Среднее арифметическое отрицательных чисел данного массива: " + findNegativeNumbersAVG(values));
    }

    private static int findMaxValue ( int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }

    private static int findPositiveNumbersSum ( int[] array) {
        int positiveNumbersSum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0)
                positiveNumbersSum = positiveNumbersSum + array[i] ;
        }
        return positiveNumbersSum;
    }

    private static int findEvenNegativeNumbersSum ( int[] array) {
        int evenNegativeNumbersSum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0 && (array[i] % 2) == 0)
                evenNegativeNumbersSum = evenNegativeNumbersSum + array[i] ;
        }
        return evenNegativeNumbersSum;
    }

    private static int findPositiveNumbersQuantity ( int[] array) {
        int positiveNumbersQuantity = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0)
                positiveNumbersQuantity = positiveNumbersQuantity + 1 ;
        }
        return positiveNumbersQuantity;
    }

    private static double findNegativeNumbersSum ( int[] array) {
        double negativeNumbersSum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0)
                negativeNumbersSum = negativeNumbersSum + array[i] ;
        }
        return negativeNumbersSum;
    }

    private static int findNegativeNumbersQuantity ( int[] array) {
        int negativeNumbersQuantity = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0)
                negativeNumbersQuantity = negativeNumbersQuantity + 1 ;
        }
        return negativeNumbersQuantity;
    }

    private static double findNegativeNumbersAVG ( int[] array) {
        double negativeNumbersAVG = findNegativeNumbersSum(array) / findNegativeNumbersQuantity(array);
        return negativeNumbersAVG;
    }
}

