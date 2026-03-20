package LinkedList;

public class DeleteHead {
    // generating static class node
    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class HeadTail {
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

        void Print() {
            if (head == null) {
                return;
            }
            node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("NULL");
        }

        void DeleteHead() {
            if (head == null) {
                return;
            } else {
                head = head.next;
            }
        }
    }
    public static void main(String[] args){
        HeadTail ll = new HeadTail();
        for(int i=1; i<=10; i++){
            // Adding tail using loop just for convenience of (multiple of 5)
            ll.AddTail(5*i);
        }
        ll.Print();
        ll.DeleteHead();
        ll.Print();
    }
}
