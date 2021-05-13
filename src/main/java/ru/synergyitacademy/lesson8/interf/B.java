package ru.synergyitacademy.lesson8.interf;

public interface B extends A {
    default void print() {
        System.out.println("test");
    }
}
