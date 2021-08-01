package cc;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;

public class LinkedList {
    Node head;
    Node tail;


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

    public void addFirst(int value){
        Node tmp = head;
        head.data=value;
        head.next=tmp;
    }

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
/*// System.out.println(current.data);
            if(current.data == value) {
                node.next = current;
                current = node;
               // vals.add(current.data);
               System.out.println("cur "+current.data);
                System.out.println("next "+current.next.data);
            }
            current=current.next;*/
    public void insertAfter(int value, int valueToAdd){


        Node node = new Node(valueToAdd);
        Node current = head;
        //Node nextCurrent = current.next;
        while(current != null){
            //System.out.println("1");
            if(current.data==value){
                node.next=current.next;
                current.next=node;
                //System.out.println("2");
            }
            current=current.next;
        }


    }
/*            if(current.data == value){
                node.next=current;
                current=node;
            }
            vals.add(current.data);
            current=current.next;*/


    public ArrayList<Integer> viewList(){
        ArrayList<Integer> vals = new ArrayList<Integer>();
        Node current = head;
        while(current.next != null){
            vals.add(current.data);
            current=current.next;
        }
        vals.add(current.data);
        return vals;
    }

}