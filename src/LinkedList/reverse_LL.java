package LinkedList;

class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}

class reverse_LL {
    static node reverse(node head) {
        node prev = null;
        node curr = head;
        while (curr != null) {
            node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    static void PrintElements(node h) {
        if (h == null)
            return;
        node temp = h;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        node head = new node(1);
        head.next = new node(2);
        head.next.next = new node(3);
        head.next.next.next = new node(4);
        head.next.next.next.next = new node(5);
//        node temp = new node(0);
//        for (int i = 1; i <= 10; i++) {
//            // Wish to add the table of 5 as demo
//            head = head.next;
//            head = new node(i * 3);
//            temp = temp.next;
//            temp = head;
//        }
        PrintElements(head);
        PrintElements(reverse(head));
    }
}
