package cc;

import com.google.common.collect.Lists;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


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

    // adding node to the first
    public String insert(int value){

        Node node = new Node(value);
        if(head == null){
            head = node;
        }
        else{
            node.next = head;
            head = node;
        }
        return "Value Added";
    }

    // adding node before specific one
    public void insertBefore(int value, int valueToAdd){

        Node node = new Node(valueToAdd);
        Node current = head;
        Node tmp = head;

        if (value == head.data){
            node.next = head;
            head = node;
        }else{
            while (current != null) {

                if (current.data == value) {

                    node.next = tmp.next;
                    tmp.next = node;
                }
                tmp = current;
                current = current.next;
            }
        }
    }

    // inserting node after specific one
    public void insertAfter(int value, int valueToAdd){

        Node node = new Node(valueToAdd);
        Node current = head;
        while(current != null){
            if(current.data==value){
                node.next=current.next;
                current.next=node;
            }
            current=current.next;
        }

    }

    // list isInclude??
    public boolean includes(int value){
        boolean includeOrNot = false;
        Node current = head;
        while(current.next != null){
            if(value == (current.data)){
                includeOrNot = true;
            }
            current = current.next;
        }
        return includeOrNot;
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

     // The above methods are from previous code challenges
//--------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------
    // Bellow is for Code Challenge 07

    public int kthFromEnd(int k) {
// indexOf(Object o) — Searches the list for the specified Object and returns its position in the list. Throws an exception if the object passed into the method is not in the list.
        List<Integer> nodesArrRev = Lists.reverse(getValues()) ;
        // throw new IndexOutOfBoundsException();
        try{
            nodesArrRev.get(k);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Error, k shouldn't be negative number or more than the nodes' list size");
            e.hashCode();
            e.printStackTrace();
        }
        return nodesArrRev.get(k);
    }

}
