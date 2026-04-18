package Sorting;

import java.util.*;

public class Zeroes_toEnd {
    static int[] ZeroesToEnd(int[] arr) {
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != 0) {
                if (i != j) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
                i++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 2, 5, 7, 4, 0, 8, 3, 45, 0, 5, 76, 67, 87, 12, 0, 34};
        int[] brr = ZeroesToEnd(arr);
        System.out.println(Arrays.toString(brr));
    }
}