package Binary_Tree;

public class Display_BinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static void display(Node x) {
        if (x == null) return;
        System.out.print(x.data + " -> ");
        display(x.left);
        display(x.right);
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
        display(a);
    }
}
