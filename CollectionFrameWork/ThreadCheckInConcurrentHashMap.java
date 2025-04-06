package CollectionFrameWork;

import java.util.concurrent.ConcurrentHashMap;

public class ThreadCheckInConcurrentHashMap {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        // Thread 1: puts some values
        Thread writer1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                map.put(i, "Thread1_Value" + i);
                System.out.println("Thread 1 wrote: " + i);
            }
        });

        // Thread 2: also puts values
        Thread writer2 = new Thread(() -> {
            for (int i = 5; i < 10; i++) {
                map.put(i, "Thread2_Value" + i);
                System.out.println("Thread 2 wrote: " + i);
            }
        });

        writer1.start();
        writer2.start();

        try {
            writer1.join();
            writer2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nFinal Map:");
        map.forEach((key, value) -> System.out.println(key + " => " + value));
    }
}
