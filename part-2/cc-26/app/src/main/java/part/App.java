/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package part;

import java.util.ArrayList;

public class App {
    public String getGreeting() {
        return "Hello From Code Challenge 26!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());



        int arr1[] = {8,4,23,42,16,15};
        int arr2[] = {2,3,5,7,13,11};
        int arr3[] = {5,12,7,5,5,7};
        int arr4[] = {20,18,12,8,5,-2};
        insertion(arr1);
        insertion(arr2);
        insertion(arr3);
        insertion(arr4);
    }

    public static ArrayList<Integer> insertion(int numArr[])
    {


        InsertionSort ob = new InsertionSort();
        ob.sort(numArr);

        ob.printArray(numArr);
        return ob.testArray(numArr);
    }
}