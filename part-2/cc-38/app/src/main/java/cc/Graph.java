package cc;
import java.util.*;

public class Graph<T> {


    private Map<T, List<T>> map = new HashMap<>();


    public List depthFirstTraversal(T vertex) throws Exception{

        if (map.size() ==0 ){
            return null; }
        if (! map.containsKey(vertex)){
            return null; }

        List<T> nodes = new LinkedList<>();
        Stack<Node> depth = new Stack<>();
        Set<T> visited = new HashSet<>();

        Node pushNode = new Node(vertex);

        depth.push(pushNode);
        visited.add( vertex);
        nodes.add(vertex);

        while (!depth.isEmpty()){
            Node top = depth.peak();
            for (Object o : getNeighbour((T) top.data)) {
                if (!visited.contains(o)){
                    visited.add((T) o);
                    nodes.add((T) o);
                    Node pushNd = new Node(o);
                    depth.push(pushNd);
                }
                else  {
                    if (top == depth.peak() ){
                    Node poped =depth.pop();
                   }
                }
                }
         }
        return nodes ;
    }

    public List breadthFirstTraversal(T vertex) throws Exception {
        if (map.size() ==0 ){
            return null; }
        if (! map.containsKey(vertex)){
            return null; }
        List<T> nodes = new LinkedList<>();
        Queue<Node> breadth = new Queue<Node>();
        Set<T> visited = new HashSet<>();
        Node enq = new Node(vertex);
        breadth.enqueue(enq);
        visited.add( vertex);

        while (!breadth.isEmpty()){
            Node front =  breadth.dequeue();
            nodes.add((T) front.data);
            //System.out.println("front = "+front.data);
            for (Object o : getNeighbour((T) front.data)) {
                if (!visited.contains(o)){
                   // System.out.println(o);
                    visited.add((T) o);
                    Node enq2 = new Node(o);
                    breadth.enqueue(enq2);
                } } }
       // System.out.println("nodes: "+nodes);
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