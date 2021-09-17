package cc;

import java.util.ArrayList;


public class BinaryTree<T> {

    Node<T> root;

    static ArrayList<Object> preOrderList = new ArrayList<>();
    static ArrayList<Object> inOrderList = new ArrayList<>();
    static ArrayList<Object> postOrderList = new ArrayList<>();


    BinaryTree()
    {
        root = null;
    }
    BinaryTree(T value) {
        root = new Node(value);
    }


    public ArrayList<Object> preOrder(Node<T> root) throws Exception {

        if (root != null) {
            preOrderList.add(root.data);

            if (root.left != null) {
                preOrder(root.left);
            }
            if (root.right != null) {
                preOrder(root.right);
            }
        }else{
            System.out.println("Root is Null");
            throw new Exception();
        }
        return preOrderList;
    }
    public ArrayList<Object> inOrder (Node root) throws Exception {

        if (root != null){
            if(root.left !=null){
                inOrder(root.left);
                //  System.out.println(root.left.data);
                if(!inOrderList.contains(root.left.data)){
                    inOrderList.add(root.left.data);
                }
            }
            // System.out.println(root.data);
            if(!inOrderList.contains(root.data)){
                inOrderList.add(root.data);
            }
            if(root.right !=null){
                inOrder(root.right);
                //  System.out.println(root.right.data);
                if(!inOrderList.contains(root.right.data)){
                    inOrderList.add(root.right.data);
                }
            }

        }else{
            System.out.println("Root is Null");
            throw new Exception();
        }
        return  inOrderList;
    }
    public ArrayList<Object> postOrder(Node root) throws Exception {
        if (root != null) {
            if (root.left != null) {
                postOrder(root.left);
            }
            if (root.right != null) {
                postOrder(root.right);
            }
            postOrderList.add(root.data);
        }else{
            System.out.println("Root is Null");
            throw new Exception();
        }

        return postOrderList;
    }

    public void preOrderNew(Node<T> root){

        if (root != null){
            System.out.print(root.data + " -> ");
        }
        if (root.left != null){
            preOrderNew(root.left);
        }
        if (root.right != null){
            preOrderNew(root.right);
        }

    }

    public void inOrderNew(Node<T> root){

        if(root.left != null){
            inOrderNew(root.left);
        }
        System.out.print(root.data+" -> ");

        if (root.right != null){
            inOrderNew(root.right);
        }
    }

    public void postOrderNew(Node<T> root){

        if(root.left != null){
            postOrderNew(root.left);
        }

        if (root.right != null){
            postOrderNew(root.right);
        }
        System.out.print(root.data+" -> ");
    }


}