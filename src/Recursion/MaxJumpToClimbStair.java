package Recursion;

import java.util.Scanner;

public class MaxJumpToClimbStair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total stair : ");
        int a = sc.nextInt();
        System.out.println(maxCombo2(a));
        System.out.println(maxCombo3(a));
    }

    //    Method to find max possibility to climb stair with max 2 jumps at once
    private static int maxCombo2(int a) {
        if (a == 1 || a == 2) return a;
        return maxCombo2(a - 1) + maxCombo2(a - 2);
    }

    //    Method to find max possibility to climb stair with max 3 jumps at once
    private static int maxCombo3(int a) {
        if (a == 1 || a == 2 || a == 3) return a;
        return maxCombo2(a - 1) + maxCombo2(a - 2) + maxCombo3(a - 3);
    }
}
