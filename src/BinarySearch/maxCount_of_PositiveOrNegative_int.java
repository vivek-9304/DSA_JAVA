package BinarySearch;

import java.util.Arrays;

public class maxCount_of_PositiveOrNegative_int {
    static int[] Max(int[] arr) {
        int p = arr.length - Algo(arr, 1);
        int n = Algo(arr, 0) + 1;
        return new int[]{p, n};

    }

    static int Algo(int[] arr, int k) {
        int start = 0, end = arr.length - 1, idx = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < k) start = mid + 1;
            else {
                idx = mid;
                end = mid - 1;
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        int[] arr = {-19, -17, -12 - 6, -4, -3, -2, -1, 1, 2, 3, 4, 7, 9};
        int k = 0;
        System.out.print("[+ve, -ve] = " + Arrays.toString(Max(arr)));
    }
}
