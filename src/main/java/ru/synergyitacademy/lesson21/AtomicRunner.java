package ru.synergyitacademy.lesson21;

import lombok.AllArgsConstructor;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicRunner {

    public static void main(String[] args) {
        IntHolder holder = new IntHolder(new AtomicInteger(100));
        new Thread(() -> {
            holder.value = new AtomicInteger(holder.value.addAndGet(100));
            System.out.println(holder.value.get());
        }).start();

        new Thread(() -> {
            holder.value = new AtomicInteger(holder.value.addAndGet(-10));
            System.out.println(holder.value.get());
        }).start();
    }

    @AllArgsConstructor
    static class IntHolder {
        AtomicInteger value;
    }
}
