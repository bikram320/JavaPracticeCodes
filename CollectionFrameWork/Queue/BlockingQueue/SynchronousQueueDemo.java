package CollectionFrameWork.Queue.BlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class SynchronousQueueDemo {
    public static void main(String[] args) {
        /*
        A SynchronousQueue is a special type of queue in Java (from the java.util.concurrent package)
        that is used for direct handoff between threads.
        ->A SynchronousQueue has no internal capacity, not even a size of one.
        ->It does not store elements — every put() must wait for a take(), and every take() must wait for a put().
        ->It’s like a hand-to-hand exchange — think of it like passing a note from one hand to another
        without putting it down.
         */

        BlockingQueue<String> queue = new SynchronousQueue<>();

        //producer Thread
        new Thread(()->{
            try{
                System.out.println("Producer Thread : Waiting to put Data...");
                queue.put("Message");
                System.out.println("Producer Thread : Successfully put Data .");
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }).start();

        //consumer Thread
        new Thread(()->{
            try{
                System.out.println("Consumer Thread : Ready to take Data..");
                System.out.println("Consumer Get : "+queue.take());
            }catch (Exception e ){
                System.out.println(e.getMessage());
            }
        }).start();

    }
}
