package ru.synergyitacademy.lesson20.thread;

import lombok.SneakyThrows;

public class PrinterThread extends Thread {

    private final String text;

    public PrinterThread(String text) {
        this.text = text;
        setName(PrinterThread.class.getSimpleName());
    }

    @SneakyThrows
    @Override
    public void run() {
        Thread.sleep(1000);
        System.out.println(getName() + ": " + text);
    }
}
