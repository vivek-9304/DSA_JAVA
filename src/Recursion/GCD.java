package Recursion;

import java.util.Scanner;

public class GCD {
    static int gcd(int a, int b) {
        if (b % a == 0) return a;
        return gcd(b % a, a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(x, b));
    }
}
