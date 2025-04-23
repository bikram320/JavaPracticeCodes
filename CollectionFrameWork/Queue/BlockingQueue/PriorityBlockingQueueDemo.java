package CollectionFrameWork.Queue.BlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

class Task implements Comparable<Task>{

    private int prio;
    private String name ;

    public Task(String name , int priority){
        this.name=name;
        this.prio=priority;
    }

    @Override
    public int compareTo(Task o) {
        return Integer.compare(this.prio,o.prio);
    }
    public String toString(){
        return "Priority : "+this.prio+" Name : "+this.name;
    }
}
public class PriorityBlockingQueueDemo {
    public static void main(String[] args) throws InterruptedException {
        /*
        PriorityBlockingQueue is a concurrent and thread-safe queue in Java that implements the BlockingQueue
         interface. It is used when you want elements to be processed according to their priority,
          and also support blocking operations like waiting when the queue is empty or full.

          put won't block cause , it is unbounded and grow dynamically

          ->Priority-based ordering:
                Elements are ordered using their natural ordering (if they implement Comparable) or
                using a custom Comparator you provide.
          ->Thread-safe:
                Multiple threads can insert and retrieve elements safely.
          ->No capacity limit (unbounded):
                You can add as many elements as memory allows.
          ->Blocking operations:
                If a thread tries to take() from an empty queue, it will wait (block)
                until an element becomes available.
         */

        BlockingQueue<Task> queue = new PriorityBlockingQueue<>();

        queue.put(new Task("Bikram",1));
        queue.put(new Task("Leo",5));
        queue.put(new Task("John",3));

        while(!queue.isEmpty()){
            System.out.println(queue.take());
        }

    }
}
