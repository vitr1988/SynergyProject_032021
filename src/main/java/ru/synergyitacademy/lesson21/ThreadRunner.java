package ru.synergyitacademy.lesson21;

import lombok.SneakyThrows;

import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadRunner {

    @SneakyThrows
    public static void main(String[] args) {
        Account account = new Account("Vitalii Ivanov");
        Lock lock = new ReentrantLock();

        final long startTime = System.currentTimeMillis();
        Runnable thread1 = () -> {
//            synchronized (account) {
            try {
                if (lock.tryLock(5, TimeUnit.SECONDS)) {
                    try {
                        account.deposit(BigDecimal.valueOf(1000));
                        System.out.println(account.getBalance());
                    } finally {
                        lock.unlock();
                    }
                } else if (System.currentTimeMillis() - startTime > 5000) {
//                    return;
                }
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }

//            }
        };

        Runnable thread2 = () -> {
//            synchronized (account) {
            if (lock.tryLock()) {
                try {
                    account.withdraw(BigDecimal.valueOf(100));
                    System.out.println(account.getBalance());
                } finally {
                    lock.unlock();
                }
//            }
            } else {
                System.out.println("Lock can't be acquired");
            }

//            }
        };

        Thread th1 = new Thread(thread1);
        th1.start();
//        th1.join();
//        System.out.println(account.getBalance());

        Thread th2 = new Thread(thread2);
        th2.start();
//        th2.join();
//        System.out.println(account.getBalance());

    }
}
