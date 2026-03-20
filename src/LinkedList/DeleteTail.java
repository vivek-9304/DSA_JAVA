package LinkedList;

public class DeleteTail {
    static class node{
        int data;
        node next;
        node(int data){
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

        void DeleteTail() {
            node temp = head;
            if (head == null) {
                return;
            } else if (head == tail) {
                head = tail = null;
            } else {
                while (temp.next.next != null) {
                    temp = temp.next;
                }
                temp.next = null;
                tail = temp;
            }
        }
    }

    public static void main(String[] args) {
        HeadTail ll = new HeadTail();
        for (int i = 1; i <= 10; i++) {
            ll.AddTail(7 * i);
        }
        ll.Print();
        ll.DeleteTail();
        ll.Print();
    }
}
