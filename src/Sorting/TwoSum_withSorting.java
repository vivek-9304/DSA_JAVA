package Sorting;

import java.util.Scanner;
import java.util.Arrays;

public class TwoSum_withSorting {
    static int[] twoSum(int[] arr, int target) {
        Arrays.sort(arr);
        int i = 0, j = arr.length - 1;
        while (j > i) {
            if ((arr[j] > target) || (arr[i] + arr[j] > target)) j--;
            else if (arr[i] + arr[j] < target) i++;
            else {
                return new int[]{arr[i], arr[j]};
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {22, 2, 5, 7, 4, 8, 3, 45, 5, 11, 12, 17, 21, 34};
        int t = sc.nextInt();
        System.out.println(Arrays.toString(twoSum(arr, t)));
    }
}
