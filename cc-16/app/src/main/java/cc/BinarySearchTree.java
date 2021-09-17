package cc;

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
//    List<Integer> maxVals = new ArrayList<>();
//    public Object maxValue(Node rootNode){
//        Node max = rootNode;
//      //  System.out.println("before if "+rootNode.data);
//        if(rootNode.right != null){
//            max = rootNode.right;
//            maxVals.add((Integer) max.data);
//          //  System.out.println("inside if "+max.data);
//            maxValue(rootNode.right);
//        }
//       // System.out.println(maxVals);
//        return Collections.max(maxVals);
//    }

public int maxValue (Node rootNode){
    int max=0;
        while (rootNode.right != null){
            max = (int) rootNode.right.data;
          //  System.out.println( rootNode.data);
            rootNode= rootNode.right;
        }
        return max;
}
public int minValue (Node rootNode){
    int min=0;
        while (rootNode.left != null){
            min = (int) rootNode.left.data;
          //  System.out.println( rootNode.data);
            rootNode= rootNode.left;
        }
        return min;
}
public int secMinValue (Node rootNode){
    int secMin=0;
        while (rootNode.left.left != null){
            secMin = (int) rootNode.left.data;
          //  System.out.println( rootNode.data);
            rootNode= rootNode.left;
        }
        return secMin;
}
public int secMaxValue (Node rootNode){
    int secMax=0;
        while (rootNode.right.right != null){
            secMax = (int) rootNode.right.data;
          //  System.out.println( rootNode.data);
            rootNode= rootNode.right;
        }
        return secMax;
}

    int sum=0;

    public int sumOfLeaves(Node root){

        if (root != null){
            sum=sum +(int) root.data;
        }
        if(root.left != null){
            sumOfLeaves(root.left);
        }
        if(root.right != null){
            sumOfLeaves(root.right);
        }
        return sum;
    }

    int count = 0;
    public int numberOfLeaves(Node root){
        if (root != null){
            count++;
        }
        if(root.left != null){
            numberOfLeaves(root.left);
        }
        if(root.right != null){
            numberOfLeaves(root.right);
        }
        return count;
    }


}