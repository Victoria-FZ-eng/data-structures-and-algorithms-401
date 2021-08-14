/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package cc;

public class App {
    public String getGreeting() {
        return "Hello From Code Challenge 15";
    }

    public static void main(String[] args) throws Exception {
        System.out.println(new App().getGreeting());

//        BinaryTree tree = new BinaryTree();
//        Node root =  new Node("A");
//        root.left = new Node("B");
//        root.right = new Node("C");
//        root.left.left = new Node("D");
//        root.left.right = new Node("E");
//        root.right.left = new Node("F");
//        root.right.right = new Node("G");
//
//        System.out.println(tree.preOrder(root));
//        System.out.println(tree.inOrder(root));
//        System.out.println(tree.postOrder(root));

        BinarySearchTree biTree = new BinarySearchTree();
        Node root = new Node(50);
       biTree.addBinarySearchTree(70,root);
       biTree.addBinarySearchTree(80,root);
       biTree.addBinarySearchTree(17,root);
       biTree.addBinarySearchTree(15,root);
       biTree.addBinarySearchTree(23,root);
       biTree.addBinarySearchTree(43,root);
       biTree.addBinarySearchTree(65,root);
       biTree.addBinarySearchTree(32,root);
       biTree.addBinarySearchTree(74,root);

        System.out.println(biTree.preOrder(root));
        System.out.println(biTree.inOrder(root));
        System.out.println(biTree.postOrder(root));
        System.out.println(biTree.contains(5,root));




    }
}
