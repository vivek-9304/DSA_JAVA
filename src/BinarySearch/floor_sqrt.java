package BinarySearch;

import java.util.Scanner;

public class floor_sqrt {

    static int floorSqrt(int k) {
        int root = 0;
        for (int i = 1; i <= k; i++) {
            root = i;
            if (i * i > k) break;
        }
        return root - 1;
    }

    static int floor_cbrt(int k) {
        int root = 0;
        for (int i = 1; i <= k; i++) {
            root = i;
            if (i * i * i > k) break;
        }
        return root - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println("floor Square root = " + floorSqrt(k));
        System.out.println("floor cube root = " + floor_cbrt(k));
    }
}
