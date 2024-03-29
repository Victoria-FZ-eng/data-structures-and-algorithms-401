/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package cc;

import java.util.List;

public class App {
    public String getGreeting() {
        return "Hello From Code Challenge 36!";
    }

    public static void main(String[] args) throws Exception {
        System.out.println(new App().getGreeting());

        Graph g = new Graph();
        g.addEdge(1, 2, true);
        g.addEdge(2, 3, true);
        g.addEdge(2, 4, true);
        g.addEdge(3, 4, true);
        g.addEdge(3, 5, true);
        g.addEdge(5, 3, true);
        g.addEdge(5, 6, true);

       // System.out.println(g.getNodes());

        //Node head = new Node(3);
        try {
            System.out.println(g.breadthFirstTraversal(3));
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(bftGraph(g,"3"));
    }

    public static List bftGraph(Graph g, String x) throws Exception {
        return g.breadthFirstTraversal(x);
    }
}
