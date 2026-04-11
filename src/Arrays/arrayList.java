package Arrays;
import java.util.*;
public class arrayList {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i=0; i<20; i++){
            arr.add(i+1);
        }
        arr.add(2,50);
        int x = arr.hashCode();
        int y = arr.set(7,77);
        System.out.println(x);
        System.out.println(arr.get(7));
        System.out.println(y);
        arr.remove(Integer.valueOf(12));
        arr.remove(5);
        System.out.println(arr);

        Collections.sort(arr);
        System.out.println(arr);
    }
}
