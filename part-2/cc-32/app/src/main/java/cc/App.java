/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package cc;

import java.util.ArrayList;

public class App {
    public String getGreeting() {
        return "Hello In Code Challenge 32!";
    }

    public static void main(String[] args) throws Exception {
        System.out.println(new App().getGreeting());

        BinarySearchTree biTree = new BinarySearchTree();
        Node rootBi = new Node(50);
        biTree.addBinarySearchTree(70,rootBi);
        biTree.addBinarySearchTree(80,rootBi);
        biTree.addBinarySearchTree(17,rootBi);
        biTree.addBinarySearchTree(15,rootBi);
        biTree.addBinarySearchTree(23,rootBi);
        biTree.addBinarySearchTree(43,rootBi);
        biTree.addBinarySearchTree(65,rootBi);
        biTree.addBinarySearchTree(32,rootBi);
        biTree.addBinarySearchTree(74,rootBi);

        BinarySearchTree biTree2 = new BinarySearchTree();
        Node rootBi2 = new Node(40);
        biTree2.addBinarySearchTree(70,rootBi2);
        biTree2.addBinarySearchTree(90,rootBi2);
        biTree2.addBinarySearchTree(11,rootBi2);
        biTree2.addBinarySearchTree(15,rootBi2);
        biTree2.addBinarySearchTree(30,rootBi2);
        biTree2.addBinarySearchTree(40,rootBi2);
        biTree2.addBinarySearchTree(65,rootBi2);
        biTree2.addBinarySearchTree(32,rootBi2);
        biTree2.addBinarySearchTree(74,rootBi2);



        getIntersections(biTree,rootBi,rootBi2,biTree2);

    }

    public static ArrayList<Integer> getIntersections(BinarySearchTree bt1, Node r1, Node r2, BinarySearchTree bt2) throws Exception {

        ArrayList<Integer> intersections = new ArrayList<>();
        Map map =  new Map();
        ArrayList<Integer> tree1 =  bt1.preOrder(r1);
        ArrayList<Integer> tree2=bt2.postOrder(r2);

        for (int i = 0; i < tree1.size(); i++) {
            map.add(tree1.get(i),0);
        }

        for (int i = 0; i < tree2.size() ; i++) {
           String check = map.add2(tree2.get(i),0);
           if(check == "getKey"){
               intersections.add(tree2.get(i));
           }
        }
        System.out.println(intersections);
       return intersections;
    }


}
