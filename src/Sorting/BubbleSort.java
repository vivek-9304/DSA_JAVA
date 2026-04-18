package Sorting;

import java.util.Arrays;
public class BubbleSort {

    // To check whether array is sorted
    static boolean sorted(int[] arr){
        int l=0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]<=arr[i+1]){
                l++;
            }
        }
        return l == arr.length - 1;
    }

    static int[] Bubble(int[] arr){
        for(int i=1; i<arr.length; i++){
            for(int j=0; j<arr.length-i; j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    static int[] Bubble_Descending(int[] arr){
        for(int i=1; i<arr.length; i++){
            for(int j=0; j<arr.length-i; j++){
                if (arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args){
        int[] arr = {2,5,7,4,8,3,45,5,76,67,87,12,34};
        System.out.println("Unsorted : "+Arrays.toString(arr));
        int[] brr = Bubble(arr);
        System.out.println("Sorted : "+Arrays.toString(brr));
        if(sorted(brr)){
            System.out.println("Sorted");
        }else{
            System.out.println("Unsorted");
        }
        int[] crr = Bubble_Descending(arr);
        System.out.println("Reverse sorted : "+Arrays.toString(crr));
    }
}
