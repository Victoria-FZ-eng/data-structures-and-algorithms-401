package cc;

public class Node<T> {

    public T data;
    Node<T> left;
    Node<T> right;
    Node<T> next;

    public Node(T value) {
        data = value;
    }
}