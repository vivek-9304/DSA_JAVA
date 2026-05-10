package Binary_Tree;

public class BT_size {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            right = null;
            left = null;
        }
    }

    private static int size(Node a) {
        if (a == null) return 0;
        return 1 + size(a.left) + size(a.right);
    }

    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(4);
        Node c = new Node(7);
        Node d = new Node(-2);
        Node e = new Node(9);
        Node f = new Node(5);
        Node g = new Node(-6);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        System.out.println(size(a));
    }
}
