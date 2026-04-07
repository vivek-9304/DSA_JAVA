package Arrays;

import java.util.Scanner;
public class Rotate_array {
    static int[] rotate(int[] arr, int d){
        int[] brr = new int[arr.length];
        for(int i=d; i<arr.length; i++){
            brr[i-d] = arr[i];
        }
        for(int i=0; i<d; i++){
            brr[arr.length-d+i] = arr[i];
        }
        return brr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,3,4,6,8,9,12,18,34};
        int d = sc.nextInt();
        int[] num = rotate(arr, d);
        for(int i : num){
            System.out.print(i+", ");
        }
    }
}
