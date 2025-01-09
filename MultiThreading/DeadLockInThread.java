package MultiThreading;

public class DeadLockInThread {

    final String Hi = " HI";
    final String Hello = " HELLO";

    Thread t1 = new Thread(){
        @Override
        public void run(){
            synchronized (Hi){
                System.out.println(Thread.currentThread().getName()+" Locked "+Hi);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (Hello){
                    System.out.println(Hi+Hello);
                }
            }
        }
    };
    Thread t2 = new Thread(){
        @Override
        public void run(){
            synchronized (Hello){
                System.out.println(Thread.currentThread().getName()+" Locked "+Hello);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (Hi){
                    System.out.println(Hi+Hello);
                }
            }
        }
    };

    public static void main(String[]args){

        DeadLockInThread obj = new DeadLockInThread();
        obj.t1.start();
        obj.t2.start();

    }
}
