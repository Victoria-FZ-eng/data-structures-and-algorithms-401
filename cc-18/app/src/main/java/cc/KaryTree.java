package cc;

import java.util.ArrayList;

public class KaryTree <T>{

    Node parent;
    ArrayList<Node> child;


ArrayList<String> fizzBuzz =new ArrayList<>();
    public ArrayList<String> nodesFizzBuzz(Node p)
    {
        parent=p;
        if (parent != null){

            for (int i = 0; i < p.child.size(); i++) {
                Node x = (Node) p.child.get(i);

                if (x.data %5 ==0 && x.data%3 ==0 ){
                    fizzBuzz.add("FizzBuzz");
                }else if(x.data %5 ==0){
                    fizzBuzz.add("Buzz");
                }else if(x.data %3 ==0){
                    fizzBuzz.add("Fizz");
                }else {
                    fizzBuzz.add("num: "+x.data);
                }
            }
            for (int i = 0; i < p.child.size(); i++) {
                Node x = (Node) p.child.get(i);
                nodesFizzBuzz(x);

            }
        }
        return fizzBuzz;
    }



}
