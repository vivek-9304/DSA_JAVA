package Recursion;

import java.util.Scanner;

public class reverse {
    static int rev(int x, int num) {
//        int n = 0;
//        while (x > 0) {
//            int n = x % 10;
//            num = (num * 10) + n;
//            x /= 10;
//        }
        if (x == 0) return num;
        return rev(x / 10, (num * 10) + (x % 10));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print(rev(x, 0));
    }
}
