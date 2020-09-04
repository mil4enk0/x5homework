package homeworks.homework2.task9;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        int[] values = {15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, 52};
        String intValuesString = Arrays.toString(values);
        System.out.println("Массив чисел: " + intValuesString);
        System.out.println("Массив чисел в обратном порядке: ");
        reverseArray(values);
    }

    public static void reverseArray (int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
