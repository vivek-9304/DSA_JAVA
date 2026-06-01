package Patterns;

import java.util.Scanner;

public class StarBox {
    /*
     * * * * *
     * * * * *
     * * * * *
     * * * * *
     * * * * *
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int x = sc.nextInt();
        boxPattern(x);
    }

    private static void boxPattern(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
