package cc;

public class PseudoQueue<T> {

    Stack<T> one = new Stack<T>();
    Stack<T> two = new Stack<T>();

    public void enqueue(T value) throws Exception {
        while (!one.isEmpty()) {
            two.push(one.pop());
        }
        one.push(value);
        while (!two.isEmpty()) {
            one.push(two.pop());
        }
    }

    public T dequeue() throws Exception {
        if (one.isEmpty())
        {
            System.out.println("Q is Empty");
            System.exit(0);
        }

        T x = one.peak();
        one.pop();
        return x;
    }

    public String displayQueue(){
       return one.stackArr.toString();
    }
}
