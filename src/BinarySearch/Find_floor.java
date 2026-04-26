package BinarySearch;

import java.util.Scanner;

public class Find_floor {
    static int floor(int[] arr, int k) {
        int start = 0, end = arr.length - 1, idx = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > k) end = mid - 1;
            else {
                idx = mid;
                start = mid + 1;
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 3, 4, 5, 5, 7, 8, 12, 34, 45, 67, 76, 87};
        int k = sc.nextInt();
        System.out.println("floor = " + floor(arr, k));
    }
}
