package cc;

import java.util.ArrayList;
import java.util.HashSet;


public class BinaryTree<T> {

    Node<T> root;

    BinaryTree()
    {
        root = null;
    }
    BinaryTree(T value) {
        root = new Node(value);
    }

    Queue breadth = new Queue();
    public HashSet<T> breadthFirst(Node<T> root) throws Exception {

        breadth.enqueue(root.data);
       // Node front=new Node(null);
        if(root != null){
            breadth.enqueue(root.data);
            System.out.println(root.data);
           // breadth.enqueue(root.data);
            if(root.left !=null){
                breadth.enqueue(root.left.data);
            }
            if (root.right != null){
                breadth.enqueue(root.right.data);
            }
            if(root.left !=null){
                breadthFirst(root.left);
            }
            if (root.right != null){
                breadthFirst(root.right);
            }
        }
        HashSet<T> arr = new HashSet<>();
        arr.addAll(breadth.queueArr);
        return arr;
    }

//    Queue breadth = new Queue();
//    public ArrayList<T> breadthFirst(Node<T> root) throws Exception {
//
//        breadth.enqueue(root.data);
//
//        if(root != null){
//          //  Node front=new Node(breadth.dequeue());
//           // System.out.println(front);
//            // breadth.enqueue(root.data);
//            if(root.left !=null){
//                breadthFirst(root.left);
//            }
//            if (root.right != null){
//                breadthFirst(root.right);
//            }
//
//        }
//        return breadth.queueArr;
//    }

//
//    static ArrayList<Object> preOrderList = new ArrayList<>();
//    static ArrayList<Object> inOrderList = new ArrayList<>();
//    static ArrayList<Object> postOrderList = new ArrayList<>();





//    public ArrayList<Object> preOrder(Node<T> root) throws Exception {
//
//        if (root != null) {
//            preOrderList.add(root.data);
//
//            if (root.left != null) {
//                preOrder(root.left);
//            }
//            if (root.right != null) {
//                preOrder(root.right);
//            }
//        }else{
//            System.out.println("Root is Null");
//            throw new Exception();
//        }
//        return preOrderList;
//    }
//    public ArrayList<Object> inOrder (Node root) throws Exception {
//
//        if (root != null){
//            if(root.left !=null){
//                inOrder(root.left);
//                //  System.out.println(root.left.data);
//                if(!inOrderList.contains(root.left.data)){
//                    inOrderList.add(root.left.data);
//                }
//            }
//            // System.out.println(root.data);
//            if(!inOrderList.contains(root.data)){
//                inOrderList.add(root.data);
//            }
//            if(root.right !=null){
//                inOrder(root.right);
//                //  System.out.println(root.right.data);
//                if(!inOrderList.contains(root.right.data)){
//                    inOrderList.add(root.right.data);
//                }
//            }
//
//        }else{
//            System.out.println("Root is Null");
//            throw new Exception();
//        }
//        return  inOrderList;
//    }
//    public ArrayList<Object> postOrder(Node root) throws Exception {
//        if (root != null) {
//            if (root.left != null) {
//                postOrder(root.left);
//            }
//            if (root.right != null) {
//                postOrder(root.right);
//            }
//            postOrderList.add(root.data);
//        }else{
//            System.out.println("Root is Null");
//            throw new Exception();
//        }
//
//        return postOrderList;
//    }


}
