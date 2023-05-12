package Seminar3.HWTask1;

public class Node<T> {
    protected T data;
    protected Node<T> next;

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    @Override
    public String toString() {
        return String.format("Node " + data);
    }
}
