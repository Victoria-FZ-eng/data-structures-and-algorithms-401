package cc;

import java.util.ArrayList;

public class LinkedList {
    Node head;
    Node tail;

//    public void add(int val){
//        Node<Integer> head = new Node<>(val,val );
//    }
    public String insert(int value){

        Node node = new Node(value);
        if(head == null){
            head = node;
            //tail = head;
        }
        else{
            node.next = head;
            head = node;
        }
        return "Value Added";

        // add Node to the end
//        Node node = new Node(value);
//        if(head == null){
//            head = node;
//            tail = head;
//        }
//        else{
//            tail.next = node;
//            tail = node;
//        }
//        return "Value Added";
    }

    public boolean includes(int value){

        Node current = head;
        while(current.next != null){
            if(current.data == value){
                return true;
            }
            current = current.next;
        }
        if(current.data == value){
            return true;
        }
        return false;
    }

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
//    public void insertFirst(int val){
//        Node newNode = new Node(val);
//        newNode.next = head;
//        head = newNode;
//Object item;
//    Node next;
//
//    Node(Object item){
//        this.item = item;
//        this.next = null;
//    }
//
//    Node(Object item, Node next){
//        this.item = item;
//        this.next = next;
//    }
//    }
}
