package homeworks.homework6.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Orange> orangeList = new ArrayList<>();
        orangeList.add(new Orange());
        orangeList.add(new Orange());
        orangeList.add(new Orange());
        Box<Orange> orangeBox = new Box<>(orangeList);
        List<Apple> appleList = new ArrayList<>();
        appleList.add(new Apple());
        appleList.add(new Apple());
        Box<Apple> appleBox = new Box<>(appleList);
        System.out.println(orangeBox.getWeight());
        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.compare(appleBox));
        List<Apple> appleListSecond = new ArrayList<>();
        appleListSecond.add(new Apple());
        appleListSecond.add(new Apple());
        appleListSecond.add(new Apple());
        Box<Apple> appleBoxSecond = new Box<>(appleListSecond);
        System.out.println(appleBoxSecond.getWeight());
        System.out.println(appleBox.pourOver(appleBoxSecond));
        System.out.println(appleBoxSecond.getWeight());
        System.out.println(appleBox.getWeight());
    }
}
