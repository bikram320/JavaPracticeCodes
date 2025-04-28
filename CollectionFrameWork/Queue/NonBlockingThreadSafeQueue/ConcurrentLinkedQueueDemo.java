package CollectionFrameWork.Queue.NonBlockingThreadSafeQueue;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueDemo {
    public static void main(String[] args) {
        /*
        ConcurrentLinkedQueue is a thread-safe, non-blocking, FIFO (First In First Out) queue based on
        linked nodes.
        Threads do not have to wait or block each other; it uses Compare-And-Swap (CAS) operations internally.
         */
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();

        // Adding elements
        queue.add("Apple");
        queue.add("Banana");
        queue.offer("Cherry");

        // Viewing head
        System.out.println("Head: " + queue.peek());

        // Removing elements
        System.out.println("Removed: " + queue.poll());
        System.out.println("Head after removal: " + queue.peek());
    }
}
