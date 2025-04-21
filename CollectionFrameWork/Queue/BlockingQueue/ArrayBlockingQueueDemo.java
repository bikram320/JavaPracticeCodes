package CollectionFrameWork.Queue.BlockingQueue;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Producer implements Runnable{
    private final BlockingQueue<Integer> queue ;
    private int value = 0 ;

    public Producer(BlockingQueue<Integer> queue){
        this.queue=queue;
    }
    public void run(){
        boolean run = true;
        while(run){
            try{
                System.out.println("Produced : "+value);
                queue.put(value++);
                Thread.sleep(1000);
            }catch (Exception e ){
                System.out.println(e.getMessage());
            }
            if(value==6){
               run=false;
            }
        }
    }
}
class Consumer implements Runnable{
    private final BlockingQueue<Integer> queue ;

    public Consumer(BlockingQueue<Integer> queue){
        this.queue=queue;
    }
    public void run(){
        boolean run = true;
        while(run){
            try {
                Integer value = queue.take();
                System.out.println("Consumed : "+value);
                if(value==5){
                    run = false;
                }
                Thread.sleep(1000);
            }catch (Exception E){
                System.out.println(E.getMessage());
            }
        }

    }
}

public class ArrayBlockingQueueDemo {
    public static void main(String[] args) throws InterruptedException {
        /*
        BlockingQueue is one of the Queue interface of util.concurrent package
        -> it represents a thread-safe queue with blocking operations.
        ->  put(E e) – waits if the queue is full.
            take() – waits if the queue is empty.
         */
        /*
        ArrayBlockingQueue is one of the implementation of Blocking Queue,
        is a bounded(that means you  must have to specify the size of it),
        thread-safe first-in-first-out (FIFO) queue backed by an array.
         */
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(2);

        Thread producer = new Thread(new Producer(queue));
        Thread consumer = new Thread(new Consumer(queue));
        producer.start();
        consumer.start();


    }
}
