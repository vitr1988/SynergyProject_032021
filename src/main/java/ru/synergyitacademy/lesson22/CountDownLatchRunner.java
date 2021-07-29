package ru.synergyitacademy.lesson22;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchRunner {

    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(5);

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("Поток " + Thread.currentThread().getName() + " готов к старту.");
                    countDownLatch.countDown();
                    countDownLatch.await();
                    System.out.println("Привет из стартованного потока " + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    Thread.currentThread().interrupt();
                }
            }
        };

        for (int i = 1; i <= 10; i++) {
//            if (i == 5) {
//                barrier.reset();
//            }
            new Thread(runnable).start();
//            System.out.println("В текущий момент ожидает столько: " + barrier.getNumberWaiting());
        }
    }
}
