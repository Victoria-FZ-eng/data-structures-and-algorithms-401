package cc;

import java.util.ArrayList;

public class MergeSort {

    static void sort(int arr[]){

        int n = arr.length;

        if(n > 1 ){
            int mid = n/2;
            int leftArr[]= new int[mid];
            int rightArr[] = new int [n-mid];

            for (int i = 0; i < mid; i++) {
                leftArr[i]= arr[i];

            }


            for (int i = 0; i < (n-mid) ; i++) {
                rightArr[i]=arr[mid+i];
            }

            sort(leftArr);
            sort(rightArr);

            merge(leftArr,rightArr,arr);

        }

    }

    static void merge(int leftArr[],int rightArr[], int arr[] ){
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < leftArr.length && j < rightArr.length){
            if(leftArr[i] <= rightArr[j]){
                arr[k]= leftArr[i];
                i++;
            }else{
                arr[k]= rightArr[j];
                j++;
            }
            k++;
        }


        if(i == leftArr.length){
            for(int c=k; c<arr.length; c++,j++) {
                arr[c] = rightArr[j];
            }
        }else{
            for(int c=k; c<arr.length; c++,i++) {
                arr[c] = leftArr[i];
            }
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
