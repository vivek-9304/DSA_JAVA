package OOPs;

class Food {
    String food;
    int quantity;

    Food(String food, int quantity) {
        this.food = food;
        this.quantity = quantity;
    }

    static int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    // Method Overloading
    static int max(int a, int b) {
        return Math.max(a, b);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Food f = new Food("Burger", 7);
        System.out.println(f.food + ", " + f.quantity);
        System.out.println(Food.max(5, 7, 9));
    }
}
