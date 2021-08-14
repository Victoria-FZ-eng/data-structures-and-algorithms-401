package cc;

import java.util.ArrayList;

public class BinaryTree<T> {

    Node<T> root;

    BinaryTree(T value)
    {
        root = new Node(value);
    }

    BinaryTree()
    {
        root = null;
    }


    static ArrayList<Object> preOrderList = new ArrayList<Object>();
    static ArrayList<Object> inOrderList = new ArrayList<>();
    static ArrayList<Object> postOrderList = new ArrayList<>();



    public ArrayList<Object> preOrder(Node root) {

        if (root != null) {
            preOrderList.add(root.data);
        }
        if (root.left != null) {
            preOrder(root.left);
        }
        if (root.right != null) {
            preOrder(root.right);
        }
        return preOrderList;
    }
    public static ArrayList<Object> inOrder (Node root){

        if(root.left !=null){
            inOrder(root.left);
            inOrderList.add(root.left.data);
        }
        if(root.right !=null){
            inOrder(root.right);
        }
        return  inOrderList;
    }

    public static ArrayList<Object> postOrder(Node root){
        if(root.left != null){
            postOrder(root.left);
        }
        if(root.right !=null){
            postOrder(root.right);
        }
        postOrderList.add(root.data);

        return postOrderList;
    }

}
