package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class first_and_lastOccurrence {
    static ArrayList<Integer> Search(int[] arr, int k) {
        ArrayList<Integer> a = new ArrayList<>();
        int f = -1;
        int start = 0, end = arr.length - 1;
        while (end >= start) {
            int mid = (end + start) / 2;
            if (arr[mid] == k) {
                f = mid;
                end = mid - 1;
            } else if (arr[mid] < k) start = mid + 1;
            else end = mid - 1;
        }
        a.add(f);
        f = -1;
        start = 0;
        end = arr.length - 1;
        while (end >= start) {
            int mid = (end + start) / 2;
            if (arr[mid] == k) {
                f = mid;
                start = mid + 1;
            } else if (arr[mid] < k) start = mid + 1;
            else end = mid - 1;
        }
        a.add(f);
        return a;
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
