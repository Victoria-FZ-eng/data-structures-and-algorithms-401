package cc;

public class QuickSort {

    static void swap(int[] arr, int i, int low)
    {
        int temp = arr[i];
        arr[i] = arr[low];
        arr[low] = temp;
    }

    static int partition(int[] arr, int left, int right)
    {

        int pivot = arr[right];

        int i = (left - 1);

        for(int j = left; j <= right - 1; j++)
        {
            if (arr[j] < pivot)
            {

                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, right);
        return (i + 1);
    }

    static void quickSort(int[] arr, int left, int right)
    {
        if (left < right)
        {
            int pi = partition(arr, left, right);

            quickSort(arr, left, pi - 1);
            quickSort(arr, pi + 1, right);
        }
    }

    static void printArray(int[] arr, int size)
    {
        for(int i = 0; i < size; i++)
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

    // Reference https://www.geeksforgeeks.org/quick-sort/
}
