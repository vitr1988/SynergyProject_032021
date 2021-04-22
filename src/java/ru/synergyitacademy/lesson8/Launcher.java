package ru.synergyitacademy.lesson8;

import ru.synergyitacademy.lesson8.another.B;
import ru.synergyitacademy.lesson8.another.D;

public class Launcher {
    public static void main(String[] args) {
        B b = new B();
        b.anotherM();

        D d = new D();
        System.out.println(d.getIndex());
        b.modify(d);

        System.out.println(d.getIndex());
        SemaphoreColors colors = SemaphoreColors.GREEN;
        switch (colors) {
            case RED: {

            }
            case YELLOW: {

            }
            case GREEN: {

            }
        }
        colors.print();
        System.out.println(colors.name());
        System.out.println(colors.ordinal());

        SemaphoreColors semaphoreColor = SemaphoreColors.valueOf("YELLOW");
        semaphoreColor.print();
        System.out.println(semaphoreColor.name());
        System.out.println(semaphoreColor.ordinal());
    }
}
