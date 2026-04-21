package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonElement {

    static ArrayList<Integer> Common(int[] arr, int[] brr) {
        ArrayList<Integer> ax = new ArrayList<>();
        Arrays.sort(arr);
        Arrays.sort(brr);
        int i = 0, j = 0;
        while (i < arr.length && j < brr.length) {
            if (arr[i] == brr[j]) {
                ax.add(arr[i]);
                i++;
                j++;
            } else if (arr[i] > brr[j]) j++;
            else i++;
        }
        return ax;
    }

    public static void main(String[] args) {
        int[] arr = {22, 2, 5, 7, 4, 8, 3, 45, 5, 11, 12, 17, 21, 34};
        int[] brr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Common(arr, brr));
    }
}
