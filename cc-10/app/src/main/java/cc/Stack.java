package cc;

import com.google.common.collect.Lists;

import java.util.ArrayList;

public class Stack<T> {

    Node <T> top;
    ArrayList <T> stackArr = new ArrayList<T>();

//    public void Stack(){
//        top = new Node();
//    }

    public String push(T value){
        if (top == null){
            top = new Node(value);
            stackArr.add(top.data);
        }else{
            Node newValue = new Node(value);
            newValue.next=  top;
            top = newValue;
            stackArr.add(top.data);
        }
        return "Stack = "+stackArr.toString() ;
    }

    public T pop() throws Exception {
//        T value = null;
//        try {
//            value = top.data;
//            top = top.next;
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return value;
        T value = null;
        if (top == null){
            System.out.println("ERROR: can not pop, stack is empty");
            throw  new Exception();
        } else{
            value = top.data;
            top = top.next;
            stackArr.remove(stackArr.size()-1);
        }
        return value;
    }

    public T peak() throws Exception {
        T value = null;
        if (top == null){
            System.out.println("ERROR: can not peak, stack is empty");
            throw  new Exception();
        } else{
            value = top.data;
        }
        return value;
    }

    public boolean isEmpty(){
        boolean notEmpty = false;
        if (top ==null){
            notEmpty = false;
        }else{
            notEmpty=true;
        }
        return notEmpty;
    }

}
