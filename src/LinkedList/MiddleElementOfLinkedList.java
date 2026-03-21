package LinkedList;

import java.util.Scanner;
class LinkedList{
    // To get the element at the middle of the linked list if the size of the list is odd or the latter one if the size is even
    static class node{
        int data;
        node next;
        node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class HeadTail{
        node head;
        node tail;
        void AddTail(int val){
            node n = new node(val);
            if(head == null){
                head = tail = n;
            }else{
                tail.next = n;
                tail = n;
            }
        }
        void Print(){
            if(head == null){
                return;
            }
            node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" -> ");
                temp = temp.next;
            }
            System.out.println("NULL");
        }
        int GetMid(){
            int size = 0;
            node temp = head;
            while(temp!=null){
                size++;
                temp = temp.next;
            }
            temp = head;
            for(int i=0; i<size/2; i++){
                temp = temp.next;
            }
            return temp.data;
        }
        int getMid_bySlowFast(){
            node slow = head;
            node fast = head;
            if(head == null){
                return 0;
            }
            while(fast!=null){
                // if slow move by 1 step, fast move by 2 step. When fast will be at null slow will be at middle
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow.data;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HeadTail ll = new HeadTail();
        int x = sc.nextInt();
        for(int i=1; i<=10; i++){
            ll.AddTail(x*i);
            // used table of 10 as a reference
        }
        ll.Print();
        System.out.println(ll.GetMid()+" is the middle number");
    }
}
