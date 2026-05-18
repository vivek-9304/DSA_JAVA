package OOPs;

class Plot {
    String location = "Delhi";
    private int price = 12000;

    void p() {
        System.out.println(location + ", " + price);
    }

    public void print() {
        p();
    }
}

public class privateKeys {
    public static void main(String[] args) {
        Plot h1 = new Plot();
        h1.print();
    }
}
