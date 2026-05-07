package Patterns;

import java.util.Scanner;

public class Number_Pattern {
    /*
       1
       2 2
       3 3 3
       4 4 4 4
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int x = sc.nextInt();
        number_pattern(x);
    }

    private static void number_pattern(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
