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

    public boolean contains(int value, Node<Integer> rootNode){
        boolean contain = false;
        if (value == rootNode.data ||value == rootNode.left.data || value == rootNode.right.data ){
           return true;
        }else if(value < rootNode.data){
            contains(value, rootNode.left);
        }else if (value > rootNode.data){
            contains(value, rootNode.right);
        }
        return contain;
    }
}
