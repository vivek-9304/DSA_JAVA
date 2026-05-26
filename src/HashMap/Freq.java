package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Freq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(freq(s));
    }

    private static HashMap<Character, Integer> freq(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                int f = map.get(ch);
                map.put(ch, f + 1); //OverWrite
            } else {
                map.put(ch, 1);
            }
        }
        return map;
    }
}