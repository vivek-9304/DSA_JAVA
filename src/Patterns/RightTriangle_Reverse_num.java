package Patterns;

import java.util.Scanner;

public class RightTriangle_Reverse_num {
    /*
    5 4 3 2 1
    5 4 3 2
    5 4 3
    5 4
    5
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int x = sc.nextInt();
        pattern(x);
    }

    private static void pattern(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = x; j > i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
