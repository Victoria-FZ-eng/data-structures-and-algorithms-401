
public class Main{
    public static void main (String[] args){
        System.out.println("Hello from Code Challenge 02");

       int[] a = {2,4,6,-8};
       int[] b = {42, 8, 15, 23, 42};
       int[] aArr = insertShiftArray(a,5);
       int[] bArr = insertShiftArray(b,16);
        for (int i : aArr) {
            System.out.print(i+" ");
        }
        System.out.println("");
        for (int i : bArr) {
            System.out.print(i+" ");
        }
        System.out.println("");
    }

    public static int[] insertShiftArray(int[] arr , int num){
        int newArrLength = arr.length +1 ;
        int []newArr = new int[(int)newArrLength];
        int midIdx = newArrLength/2;
        for (int i = 0; i < midIdx; i++) {
            newArr[i]=arr[i];
        }
        newArr[midIdx]= num;
        for (int i = midIdx+1; i <newArr.length ; i++) {
            newArr[i]=arr[i-1];
        }

        return newArr;
    }
}