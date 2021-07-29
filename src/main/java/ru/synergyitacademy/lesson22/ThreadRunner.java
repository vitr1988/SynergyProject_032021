package ru.synergyitacademy.lesson22;

public class ThreadRunner {

    public static void main(String[] args) {
        System.out.println("Привет из основного потока");
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true);
        daemonThread.start();
    }

    static class DaemonThread extends Thread {

        @Override
        public void run() {
            System.out.println("Привет из демон-потока");
        }
    }
}
