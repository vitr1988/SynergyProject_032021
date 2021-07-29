package ru.synergyitacademy.lesson22;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierRunner {

    public static void main(String[] args) throws Exception {
        System.out.println("Программа стартовала");
        CyclicBarrier barrier = new CyclicBarrier(1);
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

        for (int i = 1; i <= 10; i++) {
//            if (i == 5) {
//                barrier.reset();
//            }
            new Thread(runnable).start();
//            System.out.println("В текущий момент ожидает столько: " + barrier.getNumberWaiting());
        }
    }
}
