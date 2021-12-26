package cc;
import java.util.ArrayList;

public class LinkedList {
    Node head;
    Node tail;

    public String append(int value){
        // add Node to the end
        Node node = new Node(value);
        
        
//        if(head == null){
//            head = node;
//        }
//        Node current = head;
//        while (current.next != null){
//            current= current.next;
//        }

//            current.next = node;
//            node.next=null;
        
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
