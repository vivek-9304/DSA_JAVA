package Recursion;

import java.util.Scanner;

public class OneToN {
    static void Print(int x, int i) {
        if (i > x) return;
        System.out.print(i + ", ");
        Print(x, i + 1);
    }

    static void PrintAgain(int x) {
        if (x == 0) return;
        PrintAgain(x - 1);
        System.out.print(x + ", ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Print(x, 1);
        System.out.println();
        PrintAgain(x);
    }
}
