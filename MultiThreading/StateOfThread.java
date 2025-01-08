package MultiThreading;
class ThreadFirst extends Thread{

    @Override
    public void run(){
        try {
            Thread.sleep(200);
            System.out.println("State of Thread 1 after sleeping is : "+getState());
        }catch (InterruptedException e ){
            System.out.println("Exception occur "+e.getMessage());
        }
    }
}
public class StateOfThread {
    public static void main(String []args) throws InterruptedException{
        Thread   obj = new ThreadFirst();

        System.out.println("State when newly created : "+obj.getState());

        obj.start();
        System.out.println("State when start method is invoked "+obj.getState());

        obj.join();
        System.out.println("State when Join method is invoked : "+obj.getState());
    }
}
