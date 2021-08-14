package cc;

import java.util.ArrayList;


public class BinaryTree<T> {

    Node<T> root;
    ArrayList<Node> treeList = new ArrayList<Node>();


    BinaryTree()
    {
        root = null;
    }
    BinaryTree(T value) {
        root = new Node(value);
    }


    public void treeAdd(T value,Node<T> rootNode){
            root= rootNode;
            treeList.add(root);
            if(root.left == null){
                root.left =new Node<T> (value);
                treeList.add(root.left);
            }else if (root.right == null){
                root.right= new Node<>(value);
                treeList.add(root.right);
            }else if(root.left !=null && root.right != null){
                treeAdd(value,root.left);
            }
    }


    static ArrayList<Object> preOrderList = new ArrayList<>();
    static ArrayList<Object> inOrderList = new ArrayList<>();
    static ArrayList<Object> postOrderList = new ArrayList<>();



    public ArrayList<Object> preOrder(Node<T> root) {

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
        }
        return preOrderList;
    }
    public static ArrayList<Object> inOrder (Node root){

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
