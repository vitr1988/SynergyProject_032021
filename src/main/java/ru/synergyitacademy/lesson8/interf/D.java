package ru.synergyitacademy.lesson8.interf;

public interface D extends B, C {
    default void print() {
        B.super.print();
    }
}
