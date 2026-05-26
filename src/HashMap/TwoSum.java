package HashMap;

import java.util.HashSet;
import java.util.Scanner;

public class TwoSum {
    static boolean sum(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int j : arr) {
            int x = k - j;
            if (set.contains(x) || j + x == k) return true;
            else set.add(j);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] arr = {1, 2, 4, 5, 10, 7, 9, -3, 6, 12};
        System.out.println(sum(arr, x));
    }
}
