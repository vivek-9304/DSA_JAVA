package LinkedList;

public class SearchElementInLinkedList {
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

        boolean search(int val){
            if(head == null){
                return false;
            }
            node temp = head;
            while(temp!=null){
                if(temp.data==val){
                    return true;
                }
                temp = temp.next;
            }
            return false;
        }
    }
    public static void main(String[] args) {
        HeadTail ll = new HeadTail();
        for (int i = 1; i <= 10; i++) {
            ll.AddTail(5 * i);
        }
        ll.Print();
        if(ll.search(20)) {
            System.out.println("Yes, We found the number");
        }else{
            System.out.println("Number not found");
        }
    }
}
