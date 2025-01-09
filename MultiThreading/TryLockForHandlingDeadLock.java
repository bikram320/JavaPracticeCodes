package MultiThreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount {
    private int Balance = 10000;
    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " is trying to withdraw " + amount);
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                try {
                    if (Balance >= amount) {
                        System.out.println(Thread.currentThread().getName() + " is Processing for withdraw");
                        Thread.sleep(3000);
                        Balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " Amount Withdrawn Successful . \nRemaining Balance : "+Balance);
                    } else {
                        System.out.println(Thread.currentThread().getName() + " Insufficient Balance");
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println(Thread.currentThread().getName() +" could not acquire the lock , will try again ");
            }

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class TryLockForHandlingDeadLock {
        public static void main(String[] args) {

            BankAccount bank = new BankAccount();

            Runnable run = () -> bank.withdraw(5000);

            Thread t1 = new Thread(run);
            Thread t2 = new Thread(run);

            t1.start();
            t2.start();
        }
    }

