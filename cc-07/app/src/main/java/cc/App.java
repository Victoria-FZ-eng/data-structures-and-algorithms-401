/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package cc;

public class App {
    public String getGreeting() {
        return "Hello from Code Challenge 07";
    }

    public static void main(String[] args) {

        System.out.println(new App().getGreeting());

        LinkedList list = new LinkedList();
        list.append(4);
        list.append(6);
        list.append(8);
        list.append(9);

        System.out.println(list.getValues());
        System.out.println(list.kthFromEnd(2));
        kthFromE(list,17);

    }
    public static int kthFromE(LinkedList l , int k){
        return l.kthFromEnd(k);
    }
}
