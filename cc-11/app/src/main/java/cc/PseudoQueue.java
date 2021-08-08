package cc;

public class PseudoQueue<T> {

    Node<T> front;
    Node<T> rear;
    int size;

    public void enqueue(T value){
        if (front == null){
            front = new Node<T>(value);
            rear = front;
            size = 1;
        }else{
            Node<T> neww = new Node(value);
            neww.next = front;
            front = neww;
            Node<T> current = front;
            size++;
            while (current.next !=null){
                current=current.next;
            }
            rear=current;
        }
    }

    public String  dequeue() throws Exception{
        T value = null;
        if (front == null){
            System.out.println("ERROR: can not dequeue, Queue is empty");
            throw new Exception();
        }else{
            value = rear.data;

            Node<T> current = front;
            for (int i = 0; i < size-2; i++) {
              //  System.out.println("from for "+current.data);
                current=current.next;
            }
//            while(current.next != null){
//                System.out.println("here: "+current.data);
//                current=current.next;
//            }

            //System.out.println("this "+current.data);
            rear= current;
            current.next=null;

        }
        return value.toString();
    }

    public String displayQueue(){
        StringBuilder s = new StringBuilder();
        Node<T> current = front;
        while(current.next != null){
            s.append(current.data);
            s.append("->");
            current= current.next;
           // System.out.println(current.data);
        }
        s.append(current.data);
        return s.toString();
    }
}
