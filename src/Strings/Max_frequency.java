package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Max_frequency {
    static int max_f(String str) {
        int f = 1, mf = 1;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) f++;
            }
            if (f > mf) mf = f;
            f = 1;
        }
        return mf;
    }

    static char element(String str) {
        char[] ch = str.toCharArray();
        char max = ch[0];
        Arrays.sort(ch);
        int i = 0, j, m = 1;
        for (j = 0; j < str.length(); j++) {
            if (ch[i] == ch[j]) {
                int f = j - i + 1;
                if (f > m) {
                    max = ch[i];
                    m = f;
                }
            } else i = j;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Max : " + max_f(str) + " Char : " + element(str));
    }
}
