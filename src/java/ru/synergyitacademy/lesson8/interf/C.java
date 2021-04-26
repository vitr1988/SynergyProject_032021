package ru.synergyitacademy.lesson8.interf;

public interface C extends A {
    default void print() {
        System.out.println("gsg");
    }
}
