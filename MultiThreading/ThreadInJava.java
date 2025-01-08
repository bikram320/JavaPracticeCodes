package MultiThreading;

class ABC extends Thread{
    @Override
    public void run(){
        for(int i=0; i<20; i++){
            System.out.println("This is Hi "+i+" from "+getName());
        }
    }
}

public class ThreadInJava {
    public static void main(String[]args){

        ABC t1 = new ABC();
        ABC t2 = new ABC();

        t1.start();
        t2.start();

    }
}
