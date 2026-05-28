package HashMap;

import java.util.HashSet;

public class Sets {
    public static void main(String[] args) {
        HashSet<Integer> num = new HashSet<>();
        for (int i = 0; i <= 10; i++) {
            num.add(4 * i);
        }
        System.out.println(num);
        System.out.println(num.size());
        System.out.println(num.hashCode());
        System.out.println(num.remove(24));
        System.out.println(num.contains(24));
        System.out.println(num.isEmpty());
    }
}
