

public class Main{
    public static void main (String[] args ){
        System.out.println("Hello in Code Challenge 03");
        int[] exArr= {4, 8, 15, 16, 23, 42};
        int[] exArr2= {-131, -82, 0, 27, 42, 68, 179};
        int[] exArr3= {11, 22, 33, 44, 55, 66, 77};
        int[] exArr4= {1, 2, 3, 5, 6, 7};
       BinarySearch(exArr, 15);
        BinarySearch(exArr2, 42);
       BinarySearch(exArr3, 90);
        BinarySearch(exArr4, 4);
    }
    public static void BinarySearch (int[] arr,int num){
        int min=0;
        int max=arr.length-1;
        int mid=0;
        int trial=0;
        boolean flagex=false;
        while(! flagex){
            if(min>max){
                System.out.println(-1 + "  NOT FOUND");
                break;
            }
            mid=(max+min)/2;
            trial++;
            if(arr[mid]==num){
                System.out.println("Index: "+mid+ " Element: " + arr[mid]);
               // System.out.println("trial: "+trial);
                break;
            }else if(arr[mid]<num){
                min=mid+1;
            }else if(arr[mid]>num){
                max =mid-1;
            }
        }

    }
}