package Seminar3.HWTask1;
import java.util.Iterator;

public class NewList<T> implements Iterable {
    int size = 0;
    private Node first;
    private Node last;

    void addLast(T data) {
        Node<T> nextNode = new Node<>(data);
        Node currentNode = first;

        if (first == null) {
            first = nextNode;
            last = nextNode;
        } else {
            while (currentNode.next != null)
                currentNode = currentNode.next;
            currentNode.next = nextNode;
        }
        size += 1;
    }

    void addFront(T data) {
        {
            Node<T> nextNode = new Node<>(data);
            Node currentNode = last;

            if (last == null) {
                first = nextNode;
                last = nextNode;
            } else {
                nextNode.next = first;
                first = nextNode;
            }
        }
        size += 1;
    }

    public int getSize() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            Node<T> iterNode = first;
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < getSize();
            }

            @Override
            public T next() {
                T value = iterNode.getData();
                iterNode = iterNode.next;
                index++;
                return value;
            }
        };
    }
}

