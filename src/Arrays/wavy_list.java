package Arrays;
import java.util.*;
public class wavy_list {
    /* returns wavy list
    * for example: input  [1,2,3,4,5]
    *            : output [2,1,4,3,5]
    * */
    static int[] wavy(int[] arr){
        for(int i=0; i<arr.length-1; i=i+2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        return arr;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        int[] brr = {2,4,6,7,9,10,12,18};
        System.out.println(Arrays.toString(wavy(arr)));
        System.out.println(Arrays.toString(wavy(brr)));
    }
}
