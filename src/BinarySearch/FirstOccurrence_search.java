package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class FirstOccurrence_search {
    // return first index for search target in an array of multiple target values
    static int Search(int[] arr, int x) {
        int found = -1;
        int end = arr.length - 1, start = 0;
        while (end >= start) {
            int mid = (end + start) / 2;
            if (arr[mid] == x) {
                found = mid;
                end = mid - 1;
            } else if (arr[mid] < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return found;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] arr = {2, 5, 7, 4, 8, 3, 45, 5, 76, 67, 87, 12, 34, 2, 5, 7, 4, 8, 3, 45, 5, 76, 67, 87, 12, 34
                , 2, 5, 7, 4, 8, 3, 45, 5, 76, 67, 87, 12, 342, 5, 7, 4, 8, 3, 45, 5, 76, 67, 87, 12, 34};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Search(arr, k));
    }
}
