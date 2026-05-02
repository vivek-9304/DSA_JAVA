package Recursion;

import java.util.Scanner;

public class Decreasing_Then_Increasing {
    static void print(int x) {
        if (x == 1) {
            System.out.print(x + ", ");
            return;
        }
        System.out.print(x + ", ");
        print(x - 1);
        System.out.print(x + ", ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        print(x);
    }
}
