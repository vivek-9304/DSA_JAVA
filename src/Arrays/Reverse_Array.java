package Arrays;

public class Reverse_Array {

    static int[] Reverse(int[] arr){
        int[] brr = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            brr[i] = arr[arr.length-1-i];
        }
        return brr;
    }

    public static void main(String[] args){
        int[] arr = {1,3,4,6,8,9,12,18,34};
        int[] num = Reverse(arr);
        for(int i : num){
            System.out.print(i+", ");
        }
    }
}
