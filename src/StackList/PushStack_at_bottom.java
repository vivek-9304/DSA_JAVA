package StackList;

import java.util.Stack;
import java.util.Scanner;

public class PushStack_at_bottom {
    private static void st(int num, Stack<Integer> s1, Stack<Integer> s2) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s1.push(num);
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        System.out.println(s1);
    }

    private static Stack<Integer> stk(int num, Stack<Integer> s1, Stack<Integer> s2) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s1.push(num);
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        return s1;
    }

    private static void stt(int num, Stack<Integer> s1) {
        if (s1.isEmpty()) {
            s1.push(num);
            return;
        }
        int top = s1.pop();
        stt(num, s1);
        s1.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            s1.push(i * 5);
        }
        int num = sc.nextInt();
//        st(num, s1, s2);
        stt(num, s1);
        System.out.println(s1);
    }
}
