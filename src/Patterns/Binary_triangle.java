package Patterns;

import java.util.Scanner;

/*
1
0 1
1 0 1
0 1 0 1
 */
public class Binary_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int x = sc.nextInt();
        binary_pattern(x);
    }

    private static void binary_pattern(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j <= i; j++) {
                if ((i + j) % 2 == 0) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
