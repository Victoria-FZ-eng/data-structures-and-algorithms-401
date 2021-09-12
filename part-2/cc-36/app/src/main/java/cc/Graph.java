package cc;
import java.util.*;

public class Graph<T> {


    private Map<T, List<T>> map = new HashMap<>();


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


    public String getNeighbour(T vertex) {
        StringBuilder builder = new StringBuilder();
        for (T v : map.keySet()) {
            if (v == vertex){
                builder.append(v.toString() + ": ");
                for (T w : map.get(v)) {
                    builder.append(w.toString() + " ");
                }
                builder.append("\n");
            }
        }

        return (builder.toString());
    }
}
