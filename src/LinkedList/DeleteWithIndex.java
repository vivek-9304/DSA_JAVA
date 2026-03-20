package LinkedList;
import java.util.Scanner;
public class DeleteWithIndex {
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
        void deleteElement(int idx){
            node temp = head;
            for(int i=1; i<idx; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
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
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        HeadTail ll = new HeadTail();
        for (int i = 1; i <= 10; i++) {
            ll.AddTail(x * i);
        }
        ll.Print();
        int y = sc.nextInt();
        ll.deleteElement(y);
        ll.Print();
    }
}
