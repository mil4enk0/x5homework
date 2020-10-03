package homeworks.homework6.task1;

import java.util.Arrays;

public class CollectionArrayList<E> {

    private Object[] values = {};

    public int size() {
        return values.length;
    }

    public void add(E item) {
        Object[] newValues = new Object[values.length + 1];
        for (int i = 0; i < newValues.length; i++) {
            if (i == newValues.length - 1) {
                newValues[i] = item;
                continue;
            }
            newValues[i] = values[i];
        }
        values = (E[]) newValues;
    }

    public void remove(int index) {
        Object[] newValues = new Object[values.length - 1];
        for (int i = 0; i < values.length; i++) {
            if (i == index) {
                continue;
            }
            newValues[i] = values[i];
        }
        values = (E[]) newValues;
    }

    public void remove(E item) {
        Object[] newValues = new Object[values.length - 1];
        for (int i = 0, j = 0; i < values.length; i++) {
            if (values[i].equals(item)) {
                continue;
            }
            newValues[j] = values[i];
            j++;
        }
        values = (E[]) newValues;
    }

    public E get(int index) {
        return (E) values[index];
    }

    public void clear() {
        for (int i = 0; i < values.length; i++) {
            values[i] = null;
        }
    }

    public String toString() {
        return Arrays.toString(values);
    }
}
