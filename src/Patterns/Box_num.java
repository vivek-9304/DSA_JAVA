package Patterns;

import java.util.Scanner;

public class Box_num {
    /*
    1 2 3 4 5
    1 2 3 4 5
    1 2 3 4 5
    1 2 3 4 5
    1 2 3 4 5
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int x = sc.nextInt();
        box_num(x);
    }

    private static void box_num(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print((j + 1) + " ");
            }
            System.out.println();
        }
    }
}
