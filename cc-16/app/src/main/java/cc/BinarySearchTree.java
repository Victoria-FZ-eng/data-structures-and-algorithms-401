package cc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTree extends BinaryTree{

    public void addBinarySearchTree(int value,Node<Integer> rootNode){
        root= rootNode;

        if (value < rootNode.data){
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
    List<Integer> maxVals = new ArrayList<>();
    public Object maxValue(Node rootNode){
        Node max = rootNode;
      //  System.out.println("before if "+rootNode.data);
        if(rootNode.right != null){
            max = rootNode.right;
            maxVals.add((Integer) max.data);
          //  System.out.println("inside if "+max.data);
            maxValue(rootNode.right);
        }
       // System.out.println(maxVals);
        return Collections.max(maxVals);
    }



}