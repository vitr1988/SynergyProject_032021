package ru.synergyitacademy.lesson20;

import lombok.SneakyThrows;
import ru.synergyitacademy.lesson20.thread.CalculationThread;
import ru.synergyitacademy.lesson20.thread.PrinterThread;

public class ThreadRunner {

    @SneakyThrows
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        PrinterThread printerThread = new PrinterThread("Здесь могла быть Ваша реклама");
        CalculationThread calculationThread = new CalculationThread(196, 250);
        printerThread.start();
//        printerThread.join();
        calculationThread.start();
//        calculationThread.join();
    }
}
