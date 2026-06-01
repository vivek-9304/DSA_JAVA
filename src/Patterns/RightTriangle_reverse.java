package Patterns;

import java.util.Scanner;

public class RightTriangle_reverse {
    /*
     * * * * *
     * * * *
     * * *
     * *
     *
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int x = sc.nextInt();
        rightTriangle_reverse(x);
    }

    private static void rightTriangle_reverse(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = i; j < x; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
