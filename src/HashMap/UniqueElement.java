package HashMap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.*;

public class UniqueElement {
    static int unique(int[] arr) {
        HashSet<Integer> num = new HashSet<>();
        for (int i : arr) num.add(i);
        return num.size();
    }

    static int[] uniqueArr(int[] arr) {
        HashSet<Integer> num = new HashSet<>();
        for (int i : arr) num.add(i);
        return num.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5, 6, 6, 6, 8, 9, 0, 0, -1, -1};
        int x = unique(arr);
        System.out.println("Unique Size : " + x);
        System.out.println("Elements : " + Arrays.toString(uniqueArr(arr)));
    }
}
