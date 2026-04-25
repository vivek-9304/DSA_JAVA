package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class Descending_Array {
    static boolean Search(int[] arr, int x) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int end = arr.length - 1, start = 0;
        while (end >= start) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == x) {
                return true;
            } else if (arr[mid] < x) {
                start = mid - 1;
            } else {
                end = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {87, 76, 67, 45, 34, 12, 8, 7, 5, 5, 4, 3, 2};
        int x = sc.nextInt();
        if (Search(arr, x))
            System.out.println("Element found ");
        else
            System.out.println("Not found");
    }
}
