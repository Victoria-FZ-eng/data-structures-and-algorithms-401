package part;

import java.util.ArrayList;

public class InsertionSort {

    static void sort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    static ArrayList<Integer> testArray(int arr[])
    {
        int n = arr.length;
        ArrayList<Integer> arrOut= new ArrayList<>();
        for (int i = 0; i < n; ++i)
            arrOut.add(arr[i]);

        return arrOut;
    }


}
