package BinarySearch;

import java.util.Scanner;

public class staircase_coin {
    static int sqrt(int x) {
        int start = 1, end = x;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid > x / mid) end = mid - 1;
            else if (mid == x / mid) return mid;
            else start = mid + 1;
        }
        return end;
    }

    static int Stair(int x) {
        return (int) ((-1) + sqrt(x * 8 + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(Stair(x));
    }
}
