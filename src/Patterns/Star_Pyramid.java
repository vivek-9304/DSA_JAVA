package Patterns;

import java.util.Scanner;

/*
 *
 * *
 * * *
 * * * *
 * * * * *
 */
public class Star_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int x = sc.nextInt();
        star_pyramid(x);
    }

    private static void star_pyramid(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
