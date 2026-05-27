package HashMap;

import java.util.HashMap;

public class map {
    public static void main(String[] args) {
        HashMap<String, Double> car = new HashMap<>();
        car.put("alto", 7.8);
        car.put("lambo", 9.4);
        car.put("range rover", 8.9);
        car.put("BMW", 8.5);
        System.out.println(car);
        System.out.println(car.containsValue(8.5));
        System.out.println(car.containsKey("Alto"));
        System.out.println(car.get("BMW"));
        for (String key : car.keySet())
            System.out.print(key + " : " + car.get(key) + "  ,  ");
    }
}
