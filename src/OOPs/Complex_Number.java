package OOPs;

import java.util.Scanner;

class Complex {
    int x;
    int y;

    Complex(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void print(int x, int y) {
        if (y < 0) System.out.println(x + " - " + (-y) + "i");
        else System.out.println(x + " + " + y + "i");
    }

    void add(int x1, int x2, int y1, int y2) {
        if (y1 + y2 > 0) System.out.println((x1 + x2) + " + " + (y1 + y2) + "i");
        else System.out.println((x1 + x2) + " - " + (-(y1 + y2)) + "i");
    }
}

public class Complex_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x and y : ");
        int x = sc.nextInt(), y = sc.nextInt();
        Complex c = new Complex(x, y);
        c.print(x, y);
        System.out.println("Enter value to add : ");
        int a = sc.nextInt(), b = sc.nextInt();
        c.add(x, a, y, b);
    }
}
