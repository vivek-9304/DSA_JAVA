package LinkedList;

public class AddingElementUsingHead {
    static class node{
        int data;
        node next;
        node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class HeadTail{
        // Creating static class to create object to add head and then print them
        node head;
        node tail;
        void AddHead(int val){
            node n = new node(val);
            if(head == null){
                head = tail = n;
            }else{
                n.next = head;
                head = n;
            }
        }

        void PrintElements(){
            if(head == null)
                return;
            node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" -> ");
                temp = temp.next;
            }
            System.out.println("NULL");
        }
    }

    public static void main(String args[]){
        HeadTail ht = new HeadTail();
        for(int i=1; i<=10; i++){
            // Wish to add the table of 5 as demo
            ht.AddHead(i*5);
        }
        ht.PrintElements();
    }
}
