package cc;

import java.util.ArrayList;

public class BinarySearchTree extends BinaryTree{

    public void addBinarySearchTree(int value,Node<Integer> rootNode){
        root= rootNode;
        if (value <= rootNode.data){
            if(root.left == null){
                root.left = new Node(value);
            }else{
                addBinarySearchTree(value,root.left);
            }
        }else if (value > rootNode.data){
            if(root.right ==null){
                root.right = new Node(value);
            }else{
                addBinarySearchTree(value,root.right);
            }
        }
    }
    boolean contain = false;
    public boolean contains(int value, Node<Integer> rootNode){
        root= rootNode;
        if (value == rootNode.data ){
            contain= true;
            return true;
        }else if(value < rootNode.data){
            try {
                contains(value, rootNode.left);
            }catch(Exception e){
                System.out.println("null");
            }

        }else if (value > rootNode.data){
            try {
                contains(value, rootNode.right);
            }catch(Exception e){
                System.out.println("null");
            }
        }
        return contain;
    }


}