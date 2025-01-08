package MultiThreading;
class SharedResource{
    private int data ;
    private boolean hasData;

    public synchronized void produce(int value){
        while(hasData){
            try{
                wait();
            }catch (InterruptedException e ){
                System.out.println(e.getMessage());
            }
        }
        data = value;
        hasData=true;
        System.out.println("Produced : "+value);
        notify();
    }
    public synchronized void consume(){
        while(!hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

        }
            hasData=false;
            System.out.println("Consumed : "+data);
            notify();
    }
}
class Producer implements Runnable{
    private SharedResource sharedResource;
    Producer(SharedResource sharedResource){
        this.sharedResource = sharedResource;
    }
    @Override
    public void run(){
        for(int i =1 ; i<=10; i++){
            sharedResource.produce(i);
        }
    }
}
class Consumer implements Runnable{
    private  SharedResource sharedResource;
    Consumer(SharedResource sharedResource){
        this.sharedResource = sharedResource;
    }
    @Override
    public void run(){
        for(int i=1; i<=10; i++){
            sharedResource.consume();
        }
    }
}

public class ThreadCommunication {
    public static void main(String []args){

        SharedResource sharedResource = new SharedResource();
        Thread producerThread = new Thread(new Producer(sharedResource));
        Thread consumerThread = new Thread(new Consumer(sharedResource));

        producerThread.start();
        consumerThread.start();
    }
}
