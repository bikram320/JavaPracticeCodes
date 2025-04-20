package CollectionFrameWork.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        /*
       A PriorityQueue in Java is a special type of queue where elements are ordered based
       on their priority rather than the order in which they were added.
       Unlike a normal queue (FIFO), in a PriorityQueue, the element with the highest priority is served
       before others. In Java, the lowest value is considered the highest priority by default (like a min-heap).
         */
        Queue<Integer> queue = new PriorityQueue<>();
        //adding Elements
        queue.add(10);
        queue.add(20);
        queue.add(5);
        queue.add(35);
        queue.add(15);

        System.out.println(queue);//output order is not sorted or not guaranteed

        //this loop will show how really does priority queue works
        //In priority queue ,smallest value will get higher priority so then , it will dequeue elements
        //like :- 5,10,15,20,35
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
            //poll removes the Head element
        }
    }
}
