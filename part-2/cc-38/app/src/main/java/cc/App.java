/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package cc;

public class App {
    public String getGreeting() {
        return "Hello From Code Challenge 38!";
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
            System.out.println("depth : "+g.depthFirstTraversal(3));
            System.out.println("breadth : "+g.breadthFirstTraversal(3));
        } catch (Exception e) {
            System.out.println(e);
        }

//        System.out.println("Neighour: "+g.getNeighbour(2));
//        System.out.println("Neighour: "+g.getNeighbour(3));
//        System.out.println("Neighour: "+g.getNeighbour(4));
//        System.out.println("Neighour: "+g.getNeighbour(5));
       // System.out.println(g.dfsIterative(3));
    }
}
