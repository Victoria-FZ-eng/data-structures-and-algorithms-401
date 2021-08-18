package cc;

import java.util.ArrayList;

public class Node<T> {


    public int data;
    Node<T> parent;
    ArrayList<Node> child;


    public Node(int value) {
        data = value;
        child = new ArrayList<>();
    }
}
