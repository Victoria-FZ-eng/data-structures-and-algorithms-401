/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package cc;

public class App {
    public String getGreeting() {
        return "Hello From Code Challenge 35!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());


        // Object of graph is created.
        Graph<Integer> graph = new Graph<Integer>();
        Graph<Integer> graph2 = new Graph<Integer>();
        Graph<Integer> graph3 = new Graph<Integer>();


        System.out.println(allVerteces(graph2));


        addNode(graph,0);
        addNode(graph,3);
        addEdgeApp(graph,0, 1, true);
        addEdgeApp(graph,0, 4, true);
        addEdgeApp(graph,1, 2, true);
        addEdgeApp(graph,1, 3, true);
        addEdgeApp(graph,1, 4, true);
        addEdgeApp(graph,2, 3, true);
        addEdgeApp(graph,3, 4, true);

        // print the graph.
        System.out.println("Graph:\n"
                + allVerteces(graph));

        // gives the no of vertices in the graph.

        size(graph);

        System.out.println(graph.getNeighbour(1));

        addWeightedEdge(graph3,0, 1, true, 4);
        addWeightedEdge(graph3,0, 4, true, 3);
        addWeightedEdge(graph3,1, 2, true, 5);
        addWeightedEdge(graph3,1, 3, true, 6);
        addWeightedEdge(graph3,1, 4, true, 7);
        addWeightedEdge(graph3,2, 3, true, 8);
        addWeightedEdge(graph3,3, 4, true ,3);


        System.out.println("Weighted Graph:\n"
                + allVerteces(graph3));
    }


    public static boolean addNode(Graph g, int v){

        g.addVertex(v);

        return g.hasVertex(v);
    }
    public static String addEdgeApp(Graph g, int s, int d, boolean b){

        g.addEdge(s,d,b);

        return g.getNodes();
    }
    public static String addWeightedEdge(Graph g, int s, int d, boolean b, int w){

        g.addEdgeWithWeight(s,d,b, w);

        return g.getNodes();
    }

    public String showNeighbours(Graph g, int s){

        g.getNeighbour(s);

        return g.getNodes();
    }
    public static String allVerteces(Graph g){
        return g.getNodes();
    }
    public static String size(Graph g){
        return g.getVertexCount();
    }
}
