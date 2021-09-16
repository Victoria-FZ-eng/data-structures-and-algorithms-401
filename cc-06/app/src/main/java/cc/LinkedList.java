package cc;
import java.util.ArrayList;

public class LinkedList {
    Node head;
    Node tail;

    public String append(int value){

        Node node =new Node(value);
        Node current  = head;
        if (head == null){
            head = node;
        }else{
            while(current.next != null){
                current = current.next;
            }
            node.next=null;
            current.next=node;
        }
        return "Value Added";
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