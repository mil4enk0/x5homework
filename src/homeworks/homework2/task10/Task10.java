package homeworks.homework2.task10;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        int[] values = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, 52};
        String intValuesString = Arrays.toString(values);
        System.out.println("Массив чисел: " + intValuesString);
        int temp;
        int l = values.length;
        int k = 0;
        for (int i = l-1; i >= 0; i--) {
            if (values[i] == 0) {
                k += 1;
                for (int j = i; j < l-k; j++) {
                    temp = values[j+1];
                    values[j+1] = values[j];
                    values[j] = temp;
                }
            }
        }
        System.out.println("Массив с перемещёнными в конец нулями: " + Arrays.toString(values));
    }
}
