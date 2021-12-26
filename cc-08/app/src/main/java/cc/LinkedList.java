package cc;

import java.util.*;

public class LinkedList {

    Node head;
    Node tail;

    // adding node to the end
    public String append(int value){
        // add Node to the end
        Node node = new Node(value);
        if(head == null){
            head = node;
            tail = head;
        }
        else{
            tail.next = node;
            tail = node;
        }
        return "Value Added";
    }

    // getting nodes as an array of integers
    public ArrayList<Integer> getValues(){
        ArrayList<Integer> vals = new ArrayList<Integer>();
        Node current = head;
        while(current != null){
            vals.add(current.data);
            current = current.next;
        }

        //System.out.println(vals);
        return vals;
    }

    // getting nodes in shaped
    public String getAsString(){
        String list = "";
        Node current = head;

        while(current != null){
            list = list + "{ " + current.data + " }" + " -> ";
            current = current.next;
        }
        if (current == null){
            list = list + "NULL";
        }
        // System.out.println(head);
        return list;
    }

    //---------------------------------------------------------------------------------------
    // below is the method for code challenge 08
    //---------------------------------------------------------------------------------------


    public  LinkedList zip(LinkedList l01, LinkedList l02){
        LinkedList newlist = new LinkedList();
        Node curr01 = l01.head;
        Node curr02 = l02.head;

        while (curr01.next != null || curr02.next != null){

             if (curr01 !=null){
                 newlist.append(curr01.data);
                 curr01=curr01.next;

             }if (curr02 !=null){
                newlist.append(curr02.data);
                 curr02=curr02.next;
             }

        }
        if (curr01!=null){
            newlist.append(curr01.data);
        }
        if(curr02!=null){
            newlist.append(curr02.data);
        }
   return newlist;
    }

}
