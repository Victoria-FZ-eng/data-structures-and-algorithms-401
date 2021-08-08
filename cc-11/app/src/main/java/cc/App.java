/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package cc;

public class App {
    public String getGreeting() {
        return "Hello From Code Challenge 11";
    }

    public static void main(String[] args) throws Exception {
        System.out.println(new App().getGreeting());

        PseudoQueue pseudoQueue= new PseudoQueue();
        pseudoQueue.enqueue(1);
        pseudoQueue.enqueue(2);
        pseudoQueue.enqueue(3);
        System.out.println(enQ(pseudoQueue,4));
        System.out.println(deQ(pseudoQueue));
        pseudoQueue.displayQueue();
        System.out.println(pseudoQueue.displayQueue());

    }

    public static String enQ(PseudoQueue pq, int num){
       pq.enqueue(num);
        System.out.println(pq.displayQueue());
       return pq.displayQueue();
    }

    public static String deQ(PseudoQueue pq) throws Exception {

        return pq.dequeue();
    }
}
