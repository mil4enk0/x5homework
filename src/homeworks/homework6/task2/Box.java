package homeworks.homework6.task2;

import java.util.List;

public class Box<T extends Fruit> {
    private final List<T> arrayList;

    public Box(List<T> collection) {
        this.arrayList = collection;
    }

    public double getWeight() {
        double result = 0;
        for (T elem : arrayList) {
            result += elem.getWeight();
        }
        return result;
    }

    public boolean compare(Box<? extends Fruit> boxToCompare)  {
        return this.getWeight() == boxToCompare.getWeight();
    }

    public List<T> pourOver(Box<T> box) {
        arrayList.addAll(box.arrayList);
        box.arrayList.clear();
        return arrayList;
    }
}
