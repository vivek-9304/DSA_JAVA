package HashMap;

import java.util.ArrayList;
import java.util.HashSet;

public class MissingElement {
    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 8, 9, 11};
        System.out.println(missing(arr, 5, 10));
    }

    static ArrayList<Integer> missing(int[] arr, int x, int y) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i : arr) set.add(i);
        for (int i = 0; i <= y - x; i++) {
            if (!set.contains(x + i)) {
                a.add(x + i);
            }
        }
        return a;
    }
}
