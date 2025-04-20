package CollectionFrameWork.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        /*
        Queue is an interface in java that follows FIFO principle
        Data is added from one end called Rear and removed from another end called Front

         */
        Queue<String> queue = new LinkedList<>();

        // Adding elements
        queue.add("Bikram");
        queue.add("Cris");
        queue.add("Kevin");

        // Displaying elements
        System.out.println("Queue: " + queue);

        // Removing element
        System.out.println("Removed: " + queue.remove());

        // Peeking
        System.out.println("Peek: " + queue.peek());

        // Final Queue
        System.out.println("Final Queue: " + queue);
    }
}
