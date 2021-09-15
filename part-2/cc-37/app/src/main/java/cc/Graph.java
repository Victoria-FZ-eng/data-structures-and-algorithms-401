package cc;
import java.util.*;

public class Graph<T> {


    private Map<T, List<T>> map = new HashMap<>();
    private List<Edge> edges = new ArrayList<>();

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
                  //  System.out.println(o);
                    visited.add((T) o);
                    Node enq2 = new Node(o);
                    breadth.enqueue(enq2);
                } } }
        System.out.println("nodes: "+nodes);
        return nodes;
    }
    public void addVertex(T s)
    {
        map.put(s, new LinkedList<T>());
    }


    public void addEdge(T source, T destination, boolean bidirectional) {

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
        Edge edge = new Edge(source,destination,weight);
        edges.add(edge);
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

    public String  getTripPrice(ArrayList array){
        System.out.println(array);
        //ArrayList<String > array = new ArrayList<>();
        boolean availability = false;
        boolean availability2 = false;
        int wt1=0;
        int wt2=0;
        String output = "";

        if(array.size()== 2)
        {
           // System.out.println("array of two");
            for (Edge edge : edges) {
               // System.out.println("for");
               if ((edge.from == array.get(0) && edge.to == array.get(1))|| (edge.from == array.get(1) && edge.to == array.get(0))){
                 //  System.out.println("if 1");
                   return  "True, $"+edge.weight;
               } else {
                 //  System.out.println("else 1");
                   output= "False, $0";
               }
            }
        }
        else
        {
            for (Edge edge : edges) {
                if ((edge.from == array.get(0) && edge.to == array.get(1)) ||(edge.from == array.get(1) && edge.to == array.get(0)) ){
                    availability = true;
                    wt1 = wt1+ edge.weight;
                }
                if((edge.from == array.get(1) && edge.to == array.get(2)) ||(edge.from == array.get(2) && edge.to == array.get(1))){
                    availability2 = true;
                    wt2 = wt2+ edge.weight;
                }

            }
            boolean finalBool = availability || availability2;
            int finalWt= wt1+wt2;
            if(finalBool){
                return  "True, $"+finalWt;
            }else{
                output= "False, $0";
            }
        }
        return output;
    }

}