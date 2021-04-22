package ru.synergyitacademy.lesson8;

public enum SemaphoreColors {

    RED("красный"), YELLOW("желтый", 256), GREEN("зеленый");

    final String color;
    Integer index;

    SemaphoreColors(String name) {
        this.color = name;
    }

    SemaphoreColors(String name, Integer index) {
        this(name);
        this.index = index;
    }

    public void print() {
        System.out.println(color);
    }
}
