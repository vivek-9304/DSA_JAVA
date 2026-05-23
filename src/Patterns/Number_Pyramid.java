package Patterns;

import java.util.Scanner;

/*
      1
     1 2
    1 2 3
   1 2 3 4
  1 2 3 4 5
 */
public class Number_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int x = sc.nextInt();
        num_pyramid(x);
    }

    private static void num_pyramid(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }
}
