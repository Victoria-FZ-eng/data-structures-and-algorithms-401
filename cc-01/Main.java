public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from cc-01");

        int[] arr={5,10,11};
        reverseArray(arr);
    }


    public static void reverseArray(int[] intArr){
        int num = intArr.length; //3
        int[] reversed = new int[num];
        for (int i = num-1 ;i >= 0; i-- ){
            reversed[i]= intArr[num -1 -i];
        }
        for (int i = 0 ;i < reversed.length; i++ ){
            System.out.print(" "+ reversed[i]+ " ");
        }
    }
}
