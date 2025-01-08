package MultiThreading;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceInThread {
    public static void main(String[]args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for(int i =0 ; i<10; i++){
            int finalI = i;
            executor.submit(()->{
                long result = factorial(finalI);
                System.out.println(finalI+":"+result);
            });
        }
        executor.shutdown();

    }
    public static int factorial(int n){
        try{
            Thread.sleep(500);
        }catch (InterruptedException e ){
            System.out.println(e.getMessage());
        }
        if(n==0 || n==1) return 1 ;
        else return n*factorial(n-1);
    }



}
