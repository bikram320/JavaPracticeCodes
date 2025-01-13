package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Vector;

public class ThreadCheckInVector {
    public static void main(String []args) {
        /*
            let create two thread and access the data by arraylist and vector to see the difference between them
        */
        ArrayList<Integer> list = new ArrayList<>();
       Thread t1 = new Thread(() -> {
           for(int i = 1 ; i<=1000; i++){
               list.add(i);
           }
       });
        Thread t2= new Thread(() -> {
            for(int i = 1 ; i<=1000; i++){
                list.add(i);
            }
        });

       t1.start();
       t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // arraylist is not thread safe , so it is not utilizing it's all add method Or it is not adding the value when two thread hit to each other at same time
        System.out.println("Size of ArrayList After adding 2000 values by Threads : "+list.size());


        // now implementing it with vector
        Vector<Integer> list1 = new Vector<>();
        Thread t3 = new Thread(() -> {
            for(int i = 1 ; i<=1000; i++){
                list1.add(i);
            }
        });
        Thread t4= new Thread(() -> {
            for(int i = 1 ; i<=1000; i++){
                list1.add(i);
            }
        });

        t3.start();
        t4.start();

        try {
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //vector is thread safe so, it is utilizing it's all adding method And it can be accessed ny only one thread at a time
        System.out.println("Size of Vector after Adding value for 2000 times by two threads : "+list1.size());
    }
}
