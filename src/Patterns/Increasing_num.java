package Patterns;

import java.util.Scanner;

public class Increasing_num {
    /*
    1
    2 3
    4 5 6
    7 8 9 10
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int x = sc.nextInt();
        Num_pattern(x);
    }

    private static void Num_pattern(int x) {
        int num = 1;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
