/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package cc;

public class App {
    public String getGreeting() {
        return "Hello from Code Challenge 10";
    }

    public static void main(String[] args) throws Exception {
        System.out.println(new App().getGreeting());

        System.out.println("----------Checking Stack Methods----------");
        Stack stack = new Stack();
        stack.push(11);
        stack.push(12);
        stack.push(14);
        stack.push(15);

        Stack stack2 = new Stack();
        stack2.push(20);
        stack2.push(40);
        stack2.push(60);
        stack2.push(50);

        Stack stack3 = new Stack();

        System.out.println("Pushing a node to stack: "+ pushOneStack(5));
        System.out.println("Pushing multiple nodes to stack: "+ pushMultStack(5,6,7));
        System.out.println("Popping from Stack: "+ popStack(stack));
        System.out.println("Popping from Stack: "+ popStack(stack));
        System.out.println("Popping from Stack: "+ popStack(stack));
       // System.out.println("Popping from Stack: "+ popStack(stack));
      //  System.out.println("Popping from Stack: "+ popStack(stack));
        System.out.println("Peaking top value from stack: "+ peakStack(stack2));
       // System.out.println("Peaking top value from stack: "+ peakStack(stack3));
        System.out.println("Stack checkEmpty = "+stackIsEmpty(stack3));
        System.out.println("Stack checkEmpty = "+stackIsEmpty(stack2));

        System.out.println("----------Checking Queues Methods----------");
        Queue queue = new Queue();
        queue.enqueue("Un");
        queue.enqueue("Deux");
        queue.enqueue("Trois");
        queue.enqueue("Quatre");

        Queue queue2 = new Queue();

        System.out.println(enqueueOneQue("One"));
        System.out.println(enqueueMultQue("A","B","C"));
        System.out.println("Peaking front value from queue: "+ peakQue(queue));
        System.out.println("De-queuing from Queue: "+dequeueQue(queue));
        System.out.println("De-queuing from Queue: "+dequeueQue(queue));
        System.out.println("De-queuing from Queue: "+dequeueQue(queue));
       // System.out.println("De-queuing from Queue: "+dequeueQue(queue));
       // System.out.println("De-queuing from Queue: "+dequeueQue(queue));
        System.out.println("Peaking front value from queue: "+ peakQue(queue));
       //  System.out.println("Peaking front value from queue: "+ peakQue(queue2));
        System.out.println("Queue checkEmpty = "+isQueueEmpty(queue2));
        System.out.println("Queue is checkEmpty = "+isQueueEmpty(queue));

    }

    public static String pushOneStack(int val){
        Stack s = new Stack();
        return  s.push(val);
    }
    public static String pushMultStack(int val, int val2, int val3){
        Stack s = new Stack();
        s.push(val);
        s.push(val2);
        return  s.push(val3);
    }
    public static String popStack(Stack s) throws Exception {
        String x = null;
        try{
          x=  s.pop().toString();
        }catch(IndexOutOfBoundsException exception){
            exception.printStackTrace();
        }
        return x;
    }
    public static String  peakStack(Stack s) throws Exception {
        return s.peak().toString();
    }
    public static boolean stackIsEmpty(Stack s){
        return s.isEmpty();
    }

    public static String enqueueOneQue(String s){
        Queue q = new Queue();
        return  q.enqueue(s);
    }
    public static String enqueueMultQue(String s, String s2, String s3){
        Queue q = new Queue();
        q.enqueue(s);
        q.enqueue(s2);
        return  q.enqueue(s3);
    }
    public static String dequeueQue(Queue q) throws Exception {
        return q.dequeue().toString();
    }
    public static String  peakQue(Queue q) throws Exception {
        return q.peak().toString();
    }
    public static boolean isQueueEmpty(Queue q){
        return q.isEmpty();
    }



}
