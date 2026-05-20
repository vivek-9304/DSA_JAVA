package Patterns;

import java.util.Scanner;

/*
           1
          2 3
         3 4 5
        4 5 6 7
 */
public class Centered_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int x = sc.nextInt();
        centered_pyramid(x);
    }

    private static void centered_pyramid(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(i + j + 1 + " ");
            }
            System.out.println();
        }
    }
}
