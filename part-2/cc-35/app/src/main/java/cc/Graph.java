package cc;

import java.util.*;

public class Graph <T>{

    // We use Hashmap to store the edges in the graph
    private Map<T, List<T>> map = new HashMap<>();


    public void addVertex(T s)
    {
        map.put(s, new LinkedList<T>());
    }

    // This function adds the edge between (source to destination )/ 2 nodes
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
    // with weight
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

    // This function gives the count of vertices
    public String  getVertexCount() {
        System.out.println("The graph has "
                + map.keySet().size()
                + " vertex");
        return "The graph has "
                + map.keySet().size()
                + " vertex";
    }

    // Prints list of vertices.
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

    // Prints neighbors of a vertex.
    public String getNeighbour(T vertex) {
        StringBuilder builder = new StringBuilder();
//        System.out.println("inside ");
//        System.out.println("vertex = "+ vertex);


        for (T v : map.keySet()) {
          //  System.out.println("inside for");
            if (v == vertex){
               // System.out.println("here");
                builder.append(v.toString() + ": ");
                for (T w : map.get(v)) {
                    builder.append(w.toString() + " ");
                }
                builder.append("\n");
            }
        }

        return (builder.toString());
    }


//    // This function gives the count of edges
//    public void getEdgesCount(boolean bidirection)
//    {
//        int count = 0;
//        for (T v : map.keySet()) {
//            count += map.get(v).size();
//        }
//        if (bidirection == true) {
//            count = count / 2;
//        }
//        System.out.println("The graph has "
//                + count
//                + " edges.");
//    }

//    // This function gives whether a vertex is present or not.

    public boolean hasVertex(T s)
    {
        if (map.containsKey(s)) {
            System.out.println("The graph contains "
                    + s + " as a vertex.");
            return true;
        }
        else {
            System.out.println("The graph does not contain "
                    + s + " as a vertex.");
            return false;
        }
    }

//    // This function gives whether an edge is present or not.
//    public void hasEdge(T s, T d)
//    {
//        if (map.get(s).contains(d)) {
//            System.out.println("The graph has an edge between "
//                    + s + " and " + d + ".");
//        }
//        else {
//            System.out.println("The graph has no edge between "
//                    + s + " and " + d + ".");
//        }
//    }


}
