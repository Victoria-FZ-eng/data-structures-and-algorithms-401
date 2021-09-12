package cc;
import java.util.*;

public class Graph<T> {


    private Map<T, List<T>> map = new HashMap<>();

    public List breadthFirstTraversal(Node vertex) throws Exception {
        List<T> nodes = new LinkedList<>();
        Queue<Node> breadth = new Queue<Node>();
        Set<T> visited = new HashSet<>();

        breadth.enqueue(vertex);
        visited.add((T) vertex.data);

        while (!breadth.isEmpty()){
            Node front = (Node) breadth.dequeue();
            nodes.add((T) front.data);
           // System.out.println(front.data);

            for (Object o : getNeighbour((T) vertex.data)) {

                Node neighbour = new Node(o);
                if(!visited.contains(o)){
                    visited.add((T) o);
                    breadth.enqueue(neighbour);
                }

            }

        }
        System.out.println("nodes: "+nodes);
        return nodes;
    }
    public void addVertex(T s)
    {
        map.put(s, new LinkedList<T>());
    }


    public void addEdge(T source,
                        T destination,
                        boolean bidirectional)
    {

        if (!map.containsKey(source))
            addVertex(source);

        if (!map.containsKey(destination))
            addVertex(destination);

        map.get(source).add(destination);
        if (bidirectional == true) {
            map.get(destination).add(source);
        }
    }

    public void addEdgeWithWeight(T source,
                                  T destination,
                                  boolean bidirectional, int weight)
    {

        if (!map.containsKey(source))
            addVertex(source);

        if (!map.containsKey(destination))
            addVertex(destination);

        map.get(source).add((T) (destination+","+ weight));
        if (bidirectional == true) {
            map.get(destination).add((T) (source+","+ weight));
        }
    }


    public String  getVertexCount() {
        System.out.println("The graph has "
                + map.keySet().size()
                + " vertex");
        return "The graph has "
                + map.keySet().size()
                + " vertex";
    }


    public String getNodes()
    {
        StringBuilder builder = new StringBuilder();
        if (map.size() ==0 ){
            return null;
        }
        for (T v : map.keySet()) {
            builder.append(v.toString() + ": ");
            for (T w : map.get(v)) {
                builder.append(w.toString() + " ");
            }
            builder.append("\n");
        }

        return (builder.toString());
    }


    public ArrayList getNeighbour(T vertex) {
        StringBuilder builder = new StringBuilder();
        ArrayList<T> n = new ArrayList();
        for (T v : map.keySet()) {
            if (v == vertex){
                builder.append(v.toString() + ": ");
                for (T w : map.get(v)) {
                    n.add(w);
                    builder.append(w.toString() + " ");
                }
                builder.append("\n");
            }
        }

        return n;
    }
}


// bellow is from https://www.section.io/engineering-education/graph-traversals-java/
// class Node {
//
//    int value;
//    List<Node> neighbors;
//
//    public Node(int value) {
//        this.value = value;
//        neighbors = new ArrayList<>();
//    }
//
//    public void addEdge(Node to) {
//        neighbors.add(to);
//    }
//}


//    public static void bfs(Node startNode) {
//        Queue<Node> queue = new LinkedList<>();
//        Set<Integer> visited = new HashSet<>();
//
//        queue.add(startNode);
//        visited.add(startNode.value);
//
//        while (!queue.isEmpty()) {    Node currentNode = queue.remove();
//
//            System.out.println(currentNode.value);
//
//            for (Node n : currentNode.neighbors) { // Check each neighbor node
//                if (!visited.contains(n.value)) { // If neighbor node's value is not in visited set
//                    queue.add(n);
//                    visited.add(n.value);
//                }
//            }
//        }
//    }