package CollectionFrameWork.Queue.BlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

class DelayedTask implements Delayed{

    private  String data ;
    private  long startTime;

    public DelayedTask(String data, long delayInSeconds) {
        this.data = data;
        this.startTime = System.currentTimeMillis()+TimeUnit.SECONDS.toMillis(delayInSeconds);
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long delay = startTime - System.currentTimeMillis();
        return unit.convert(delay,TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        return Long.compare(this.getDelay(TimeUnit.MILLISECONDS),o.getDelay(TimeUnit.MILLISECONDS));
    }
    public String getData(){
        return data;
    }
}

public class DelayQueueDemo {
    public static void main(String[] args) throws InterruptedException {
        /*
        A DelayQueue is a blocking queue in Java that holds elements until a specified delay has expired ,Part of java.util.concurrent package.
        ->Elements in the queue must implement the Delayed interface.
        ->You can’t take an element from the queue until its delay period is over.
        ->The head of the queue is the element whose delay has expired earliest.
         */
        BlockingQueue<DelayedTask> queue = new DelayQueue<>();
        queue.put(new DelayedTask("Task 1 ",3));
        queue.put(new DelayedTask("Task 2 ",1));
        queue.put(new DelayedTask("Task 3 ",5));
        queue.put(new DelayedTask("Task 4 ",2));

        while(!queue.isEmpty()){
            DelayedTask delayedTask = queue.take();
            System.out.println("Processing "+delayedTask.getData()+" at "+System.currentTimeMillis()/1000);
        }
    }
}

