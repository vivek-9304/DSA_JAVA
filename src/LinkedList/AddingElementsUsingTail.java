package LinkedList;

public class AddingElementsUsingTail {
    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class HeadTail {
        // Creating static class to create object to add tail and then print them
        node head;
        node tail;

        void AddTail(int val) {
            node n = new node(val);
            if (head == null) {
                head = tail = n;
            } else {
                tail.next = n;
                tail = n;
            }
        }

        void PrintElements() {
            if (head == null)
                return;
            node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("NULL");
        }
    }

    public static void main(String args[]) {
        HeadTail ht = new HeadTail();
        for (int i = 1; i <= 10; i++) {
            // Wish to add the table of 7 as demo
            ht.AddTail(i * 7);
        }
        ht.PrintElements();
    }
}
