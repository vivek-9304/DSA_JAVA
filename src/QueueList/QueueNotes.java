package QueueList;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueNotes {
    public static void main(String[] args) {

        // QUEUE USING LINKED LIST
        Queue<Integer> queue = new LinkedList<>();

        // add(E) -> Inserts element, throws exception if failed
        queue.add(10);
        queue.add(20);
        queue.add(30);

        // offer(E) -> Inserts element, returns false if failed
        queue.offer(40);

        System.out.println("Queue: " + queue);

        // element() -> Returns head, exception if empty
        System.out.println("element(): " + queue.element());

        // peek() -> Returns head, null if empty
        System.out.println("peek(): " + queue.peek());

        // remove() -> Removes head, exception if empty
        System.out.println("remove(): " + queue.remove());

        System.out.println("After remove: " + queue);

        // poll() -> Removes head, null if empty
        System.out.println("poll(): " + queue.poll());

        System.out.println("After poll: " + queue);

        // contains(Object)
        System.out.println("contains(30): " + queue.contains(30));

        // size()
        System.out.println("size(): " + queue.size());

        // isEmpty()
        System.out.println("isEmpty(): " + queue.isEmpty());

        // clear()
        Queue<Integer> temp = new LinkedList<>();
        temp.add(1);
        temp.add(2);
        temp.clear();
        System.out.println("After clear(): " + temp);

        // ITERATION

        queue.offer(50);
        queue.offer(60);
        queue.offer(70);

        System.out.println("\nUsing for-each:");
        for (int num : queue) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nUsing while:");
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }

        // PRIORITY QUEUE

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(50);
        pq.offer(10);
        pq.offer(30);
        pq.offer(20);

        System.out.println("\n\nPriorityQueue: " + pq);
        System.out.println("peek(): " + pq.peek());
        System.out.println("poll(): " + pq.poll());
        System.out.println("After poll: " + pq);
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
    }
}
