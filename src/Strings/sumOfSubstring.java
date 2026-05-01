package Strings;

import java.util.Scanner;

public class sumOfSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum = 0;
        String str = String.valueOf(x);
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.print(str.substring(i, j) + ", ");
                int k = Integer.parseInt(str.substring(i, j));
                sum += k;
            }
            System.out.println();
        }
        System.out.println("Sum : " + sum);
    }
}
