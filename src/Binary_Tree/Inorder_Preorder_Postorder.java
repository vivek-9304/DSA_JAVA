package Binary_Tree;

public class Inorder_Preorder_Postorder {
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

    static void InOrder(Node a) {
        if (a == null) return;
        InOrder(a.left);
        System.out.print(a.data + " -> ");
        InOrder(a.right);
    }

    static void PreOrder(Node x) {
        if (x == null) return;
        System.out.print(x.data + " -> ");
        PreOrder(x.left);
        PreOrder(x.right);
    }

    static void PostOrder(Node a) {
        if (a == null) return;
        PostOrder(a.left);
        PostOrder(a.right);
        System.out.print(a.data + " -> ");
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
        PreOrder(a);
        System.out.println();
        InOrder(a);
        System.out.println();
        PostOrder(a);
        System.out.println();
    }
}
