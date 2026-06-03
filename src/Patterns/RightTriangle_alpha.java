package Patterns;

import java.util.Scanner;

public class RightTriangle_alpha {
    /*
    A
    A B
    A B C
    A B C D
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int x = sc.nextInt();
        rightTriangle_alpha(x);
    }

    private static void rightTriangle_alpha(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((char) (65 + j) + " ");
            }
            System.out.println();
        }
    }
}
