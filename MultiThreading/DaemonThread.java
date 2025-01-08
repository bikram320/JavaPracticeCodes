package MultiThreading;
class TestDaemonThread implements Runnable {
    @Override
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println(Thread.currentThread().getName()+"  and Daemon Thread is Working");
        }else{
            System.out.println(Thread.currentThread().getName()+"User Thread is Working");
        }
    }

}

public class DaemonThread {
    public static void main(String[]args){

        TestDaemonThread thread = new TestDaemonThread();
        TestDaemonThread thread1 = new TestDaemonThread();
        TestDaemonThread thread2 = new TestDaemonThread();

        Thread t1 = new Thread(thread);
        Thread t2 = new Thread(thread1);
        Thread t3 = new Thread(thread2);

        t1.setDaemon(true);

        t1.start();
        t2.start();
        t3.start();

    }
}
