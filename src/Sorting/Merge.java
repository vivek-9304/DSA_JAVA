package Sorting;

import java.util.Arrays;

public class Merge {
    static int[] merge(int[] arr, int[] brr) {
        int[] ans = new int[arr.length + brr.length];
        int i = 0, j = 0, k = 0;
        while (i < arr.length && j < brr.length) {
            if (arr[i] >= brr[j]) {
                ans[k] = brr[j];
                j++;
            } else {
                ans[k] = arr[i];
                i++;
            }
            k++;
        }
        while (i < arr.length) {
            ans[k] = arr[i];
            i++;
            k++;
        }
        while (j < arr.length) {
            ans[k] = brr[j];
            j++;
            k++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 9, 10, 20, 30};
        int[] brr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31};
        System.out.println(Arrays.toString(merge(arr, brr)));
    }
}
