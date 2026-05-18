package OOPs;

import java.awt.*;

public class polymorphism {
    public static class dog {
        void voice() {
            System.out.println("bhoo");
        }
    }

    public static class cat {
        void voice() {
            System.out.println("Meou");
        }
    }

    public static class human {
        void voice() {
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        dog d = new dog();
        cat c = new cat();
        human h = new human();
        c.voice();
        d.voice();
        h.voice();
    }
}
