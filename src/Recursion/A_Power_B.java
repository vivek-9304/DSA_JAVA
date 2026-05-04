package Recursion;

import java.util.Scanner;

public class A_Power_B {
    static int aPb_logN(int a, int b) {
        if (b == 0) return 1;
        int ans = aPb_logN(a, b / 2);
        if (b % 2 == 0) return ans * ans;
        else return a * ans * ans;
    }

    static int aPb_N(int a, int b) {
        if (b == 0) return 1;
        return a * (aPb_N(a, b - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A : ");
        int a = sc.nextInt();
        System.out.print("Enter B : ");
        int b = sc.nextInt();
        System.out.println(aPb_logN(a, b));
        System.out.println(aPb_N(a, b));

    }
}
