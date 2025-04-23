package CollectionFrameWork.Queue.BlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueDemo {
    public static void main(String[] args) throws InterruptedException {
        /*
        A LinkedBlockingQueue is a thread-safe,
        blocking queue implementation in Java that uses linked nodes to store elements.
        implements the BlockingQueue interface, which means it supports operations that wait for the queue to
        become non-empty when retrieving an element, and wait for space to become available in the queue
        when storing an element.
        ->You can create it with a fixed capacity to avoid memory overuse.
        If not specified, it defaults to Integer.MAX_VALUE
         */
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(3);

        //producer Thread
         new Thread(()->{
            try{
                queue.put(1);
                System.out.println("Inserted 1");
                queue.put(2);
                System.out.println("Inserted 2");
                queue.put(3);
                System.out.println("Inserted 3");
                queue.put(4);
                System.out.println("Inserted 4");

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();

        //Consumer Thread
        Thread.sleep(1000);
        new Thread(()->{
            try{
                System.out.println("Took : "+queue.take());
                System.out.println("Took : "+queue.take());
                System.out.println("Took : "+queue.take());
                System.out.println("Took : "+queue.take());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();


    }

}
