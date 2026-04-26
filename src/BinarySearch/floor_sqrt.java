package BinarySearch;

import java.util.Scanner;

public class floor_sqrt {

    static int floorSqrt(int k) {
        int start = 0, end = k;
        int mid = (start + end) / 2;
        while (start <= end) {
            mid = (start + end) / 2;
            if (mid * mid > k) end = mid - 1;
            else if (mid * mid == k) return mid;
            else start = mid + 1;
        }
        return mid;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println("floor Square root = " + floorSqrt(k));
    }
}
