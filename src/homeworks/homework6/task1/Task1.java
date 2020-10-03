package homeworks.homework6.task1;

public class Task1 {
    public static void main(String[] args) {
//        CollectionArrayList<String> values = new CollectionArrayList<>();
//        values.add("1");
//        values.add("2");
//        values.add("3");
//        values.add("4");
//        System.out.println(values);
//        values.remove(values.size()-1);
//        System.out.println(values);
//        values.remove("2");
//        System.out.println(values);
//        values.clear();
//        System.out.println(values);

        CollectionLinkedList<String> valuesLinkedList = new CollectionLinkedList<>();
        valuesLinkedList.add("1");
        valuesLinkedList.add("2");
        valuesLinkedList.add("3");
        valuesLinkedList.add("4");
        System.out.println(valuesLinkedList);
        valuesLinkedList.remove(valuesLinkedList.size()-1);
        System.out.println(valuesLinkedList);
        valuesLinkedList.remove("2");
        System.out.println(valuesLinkedList);
        valuesLinkedList.clear();
        System.out.println(valuesLinkedList);
        valuesLinkedList.remove("5");
        System.out.println(valuesLinkedList);
    }
}
