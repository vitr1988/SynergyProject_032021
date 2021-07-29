package ru.synergyitacademy.lesson22;

import java.util.concurrent.Semaphore;

public class SemaphoreRunner {

    public static void main(String[] args) throws Exception {
        Semaphore semaphore = new Semaphore(10, true);

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    semaphore.acquire();
                    System.out.println("Привет из потока " + Thread.currentThread().getName());
                    semaphore.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    Thread.currentThread().interrupt();
                }
            }
        };
        for (int i = 1; i <= 100; i++) {
            new Thread(runnable).start();
        }
    }


}
