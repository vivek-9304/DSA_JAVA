package OOPs;

class House {
    String location;
    int price;
}

public class UserDefined {
    public static void main(String[] args) {
        House h = new House();
        h.location = "Delhi";
        h.price = 12000;
        System.out.println(h.location + ", " + h.price);
        change(h);
        // value is pass by reference
        System.out.println(h.location + ", " + h.price);
    }

    private static void change(House h) {
        h.location = "Jaipur";
    }
}
