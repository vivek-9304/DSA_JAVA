package Sorting;

import java.util.Arrays;

public class InsertionSort {
    static int[] Insertion(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j >= 1; j--) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 4, 8, 3, 45, 5, 76, 67, 87, 12, 34};
        System.out.println("Unsorted : " + Arrays.toString(arr));
        System.out.println("Sorted : " + Arrays.toString(Insertion(arr)));
    }
}


