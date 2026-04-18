package Sorting;

import java.util.Arrays;

public class SelectionSort {
    static int[] Selection(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = Integer.MAX_VALUE;
            int idx = -1;
            for (int j = i; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {22, 5, 7, 4, 8, 3, 45, 5, 76, 67, 87, 12, 34};
        int[] brr = Selection(arr);
        System.out.print(Arrays.toString(brr));
    }
}
