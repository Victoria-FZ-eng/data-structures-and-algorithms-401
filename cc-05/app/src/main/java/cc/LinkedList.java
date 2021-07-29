package cc;

public class LinkedList {
    Node head;
    Node tail;

//    public void add(int val){
//        Node<Integer> head = new Node<>(val,val );
//    }
    public void insert(int value){
        if(head == null){
            head = new Node(value);
            tail = head;
        }
        else{
            tail.next = new Node(value);
            tail = new Node(value);
        }
    }
    public boolean includes(int value){
        boolean includeOrNot = false;
        Node current = head;
        while(current.next != null){
            if(current.equals(value)){
                includeOrNot = true;
            }
            current = current.next;
        }
        return includeOrNot;
    }

    public String getAsString(){
        String list = "";
        Node current = head;
        while(current != null){
            list = list + "{ " + current + " }" + " -> ";
        }
        if (current == null){
            list = list + "NULL";
        }
        return list;
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
