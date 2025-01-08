package MultiThreading;

class Counter {
    int count = 0;

    public synchronized void increment() {
        count++;
    }
}

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        Runnable obj = () -> {
            for (int i = 1; i <= 100; i++) {
                c.increment();
            }
        };

        Runnable obj1 = () -> {
            for (int i = 1; i <= 100; i++) {
                c.increment();
            }
        };

        Thread thread = new Thread(obj);
        Thread thread1 = new Thread(obj1);

        thread.start();
        thread1.start();

        // Wait for both threads to finish
        thread.join();
        thread1.join();

        System.out.println("Final count: " + c.count);
    }
}
