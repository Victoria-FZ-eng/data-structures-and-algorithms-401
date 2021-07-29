/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package cc;

import com.sun.jdi.Value;

import java.util.ArrayList;

public class App {
    public String getGreeting() {
        return "Hello From Code Challenge 05";
    }

    public static void main(String[] args) {

        System.out.println(new App().getGreeting());

        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(15);
        list.insert(15);
        list.insert(15);
        list.insert(80);
        list.insert(14);
        list.insert(4);
        System.out.println(list.includes(14));
        System.out.println(list.includes(5));
        System.out.println(list.includes(52));
        System.out.println(list.getAsString());

        toTestInsert(10,20,30);
        toTestInsertOne(50);
        toTestEmpty();
        checkHead(10,20,30);
        toTestIncludes(10,20,30,70);
    }

    public static ArrayList<Integer> toTestInsert(int val1, int val2, int val3){
        LinkedList list = new LinkedList();
        list.insert(val1);
        list.insert(val2);
        list.insert(val3);

        System.out.println(list.getValues());
        return (list.getValues());
    }
    public static ArrayList<Integer> toTestInsertOne(int val1){
        LinkedList list = new LinkedList();
        list.insert(val1);

        System.out.println(list.getValues());
        return (list.getValues());
    }
    public static ArrayList<Integer> toTestEmpty(){
        LinkedList list = new LinkedList();
        System.out.println("empty : "+list.getValues());
        return (list.getValues());
    }
    public static int checkHead(int val1, int val2, int val3){
        LinkedList list = new LinkedList();
        list.insert(val1);
        list.insert(val2);
        list.insert(val3);

        System.out.println("head = "+list.getValues().get(0));
        return (list.getValues().get(0));
    }
    public static boolean toTestIncludes(int val1, int val2, int val3, int valToCheck){
        LinkedList list = new LinkedList();
        list.insert(val1);
        list.insert(val2);
        list.insert(val3);
        System.out.println(list.includes(valToCheck));
        return list.includes(valToCheck);

    }


}