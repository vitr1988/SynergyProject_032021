package ru.synergyitacademy.lesson22;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierRunner {

    public static void main(String[] args) throws Exception {
        System.out.println("Программа стартовала");
        CyclicBarrier barrier = new CyclicBarrier(5, new Thread(() -> {
            System.out.println("Все 5 потоков уперлись в барьер");
        }));
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("Поток " + Thread.currentThread().getName() + " готов к старту.");
                    barrier.await();
                    System.out.println("Привет из стартованного потока " + Thread.currentThread().getName());
                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                    Thread.currentThread().interrupt();
                }
            }
        };

        for (int i = 1; i <= 15; i++) {
            new Thread(runnable).start();
            Thread.sleep(1000);
        }
    }
}
