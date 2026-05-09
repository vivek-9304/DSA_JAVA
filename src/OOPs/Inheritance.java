package OOPs;

class Animal {
    int size = 180;
}

class Birds extends Animal {
    int size = 2;
}

class Eagles extends Birds {
    int size = 6;

    void display() {
        System.out.println(size);
        System.out.println(super.size);
//        System.out.println(super.super.size);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Eagles e = new Eagles();
        e.display();
    }
}
