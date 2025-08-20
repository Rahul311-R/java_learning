package OOPS;

import java.util.LinkedList;
import java.util.Queue;

public class linkedlist_queue {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        // enqueue (add elements)
        q.add("apple");
        q.add("mango");
        q.add("orange");

        System.out.println("Queue: " + q);

        // dequeue (remove first element)
        System.out.println("Removed: " + q.remove());

        // peek (get first element without removing)
        System.out.println("Peek: " + q.peek());

        System.out.println("Queue after operations: " + q);
    }
}
