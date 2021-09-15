package cc;

import java.util.ArrayList;

public class Queue<T> {

    Node<T> front;
    Node<T> rear;
    ArrayList<T> queueArr = new ArrayList<T>();

    public String enqueue(T value){
        if (front == null){
            front = new Node<>(value);
            rear = front;
            queueArr.add(front.data);
        }else{
            Node<T> neww = new Node(value);
            rear.next = neww;
            rear = neww;
            queueArr.add(rear.data);
        }
        return "Queues: "+queueArr;
    }

    public T  dequeue() throws Exception{
        T value = null;
        if (front == null){
            System.out.println("ERROR: can not dequeue, Queue is empty");
            throw new Exception();
        }else{
            value = front.data;
            front = front.next;
            queueArr.remove(0);
        }
        return value;
    }
    public T peak() throws Exception {
        T value = null;
        if (front == null){
            System.out.println("ERROR: can not peak, queue is empty");
            throw  new Exception();
        } else{
            value = front.data;
        }
        return value;
    }
    public boolean isEmpty(){
        // boolean notEmpty = false;
        if (front ==null){
            return true;
        }else{
            return false;
        }

    }
}
