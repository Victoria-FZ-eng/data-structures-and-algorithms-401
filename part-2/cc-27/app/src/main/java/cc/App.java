/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package cc;

public class App {
    public String getGreeting() {
        return "Hello From Code Challenge 27";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        int arr1[] = {8,4,23,42,16,15};
        sortArr(arr1);
        int arr2[] = {20,18,12,8,5,-2};
        sortArr(arr2);
        int arr3[] = {5,12,7,5,5,7};
        sortArr(arr3);
        int arr4[] = {2,3,5,7,13,11};
        sortArr(arr4);
    }

    public static void sortArr(int arr[]){
        MergeSort ms = new MergeSort();

        ms.sort(arr);
        ms.printArray(arr);
    }
}
