package Patterns;

import java.util.Scanner;

public class RightTriangle {
    /*
     *
     * *
     * * *
     * * * *
     * * * * *
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int x = sc.nextInt();
        rightTriangle(x);
    }

    private static void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
