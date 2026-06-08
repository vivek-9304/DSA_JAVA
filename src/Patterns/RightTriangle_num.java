package Patterns;

import java.util.Scanner;

public class RightTriangle_num {
    /*
        1
        1 2
        1 2 3
        1 2 3 4
     */
    static void rightTriangle_num(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int x = sc.nextInt();
        rightTriangle_num(x);
    }
}
