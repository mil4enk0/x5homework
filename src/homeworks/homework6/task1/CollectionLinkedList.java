package homeworks.homework6.task1;

public class CollectionLinkedList<E> {

    private Node<E> first;
    private Node<E> last;
    private int size;

    public int size() {
        return size;
    }

    public void add(E item) {
        if (size == 0) {
            first = new Node<>(item, null);
            last = first;
            size++;
            return;
        }
        Node<E> newNode = new Node<>(item, null);
        last.next = newNode;
        last = newNode;
        size++;
    }

    public void remove(int index) {
        int i = 0;
        Node<E> prevNode = first;
        Node<E> node = first;
        while ((node != null) && (i != index)) {
            prevNode = node;
            node = node.next;
            i++;
        }

        if (node == null) {
            return;
        }

        prevNode.next = node.next;
        size--;
    }

    public void remove(E item) {
        Node<E> node = first;
        Node<E> prevNode = first;
        while ((node != null) && (!node.elem.equals(item))) {
            prevNode = node;
            node = node.next;
        }

        if (node == null) {
            return;
        }

        prevNode.next = node.next;
        size--;
    }

    public E get(int index) {
        int i = 0;
        Node<E> node = first;
        while (i != index) {
            node = node.next;
            i++;
        }
        return node.elem;
    }

    public void clear() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public String toString() {
        Node<E> node = first;
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < size) {
            result.append(node.elem);
            node = node.next;
            i++;
        }
        return result.toString();
    }

    private static class Node<T> {
        private T elem;
        private Node<T> next;

        public Node(T elem, Node<T> next) {
            this.elem = elem;
            this.next = next;
        }
    }
}
