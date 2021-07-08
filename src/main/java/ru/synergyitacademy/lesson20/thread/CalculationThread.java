package ru.synergyitacademy.lesson20.thread;

import lombok.SneakyThrows;

public class CalculationThread extends Thread {

    private final Integer argA;
    private final Integer argB;

    public CalculationThread(Integer argA, Integer argB) {
        this.argA = argA;
        this.argB = argB;

        setName(CalculationThread.class.getSimpleName());
    }


    private int summa() {
        return argA + argB;
    }

    @SneakyThrows
    @Override
    public void run() {
        Thread.sleep(1000);
        System.out.println(getName() + ": " + summa());
    }

}
