package CollectionFrameWork.Queue.NonBlockingThreadSafeQueue;

import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDequeDemo {
    public static void main(String[] args) {
        /*
        ConcurrentLinkedDeque is a thread-safe, non-blocking, double-ended queue (Deque) based on linked nodes.
        ->Double-ended: Elements can be added/removed from both head and tail.
        ->Thread-safe and non-blocking: Same as ConcurrentLinkedQueue, but supports operations from both ends.
         */
        ConcurrentLinkedDeque<String> deque = new ConcurrentLinkedDeque<>();

        // Adding elements
        deque.addFirst("Apple");
        deque.addLast("Banana");
        deque.offerFirst("Cherry");
        deque.offerLast("Date");

        // Viewing elements
        System.out.println("First: " + deque.peekFirst());
        System.out.println("Last: " + deque.peekLast());

        // Removing elements
        System.out.println("Removed First: " + deque.pollFirst());
        System.out.println("Removed Last: " + deque.pollLast());
    }
}
