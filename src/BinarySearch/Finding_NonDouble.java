package BinarySearch;

import java.util.*;

public class Finding_NonDouble {
    static int Double(int[] arr) {
        int start = 0, end = arr.length - 1, mid = -1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if ((arr[mid] != arr[mid - 1]) && (arr[mid] != arr[mid + 1])) return arr[mid];

            int f = mid, s = mid;
            if (arr[mid - 1] == arr[mid]) f = mid + 1;
            else s = mid - 1;

            int left = f - start;
            if (left % 2 == 0) start = s + 1;
            else end = f - 1;
        }
        return arr[mid];
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 9, 9, 10, 10, 11, 11};
        System.out.println(Arrays.toString(arr));
        System.out.println(Double(arr));
    }
}
