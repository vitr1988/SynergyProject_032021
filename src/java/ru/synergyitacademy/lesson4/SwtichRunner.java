package ru.synergyitacademy.lesson4;

import java.util.Scanner;

public class SwtichRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение, которое ассоциируется с цветом : ");
        switch (scanner.nextInt()) {
            case 1 -> System.out.println("Выбрано значение белого цвета");
            case 2 -> System.out.println("Выбрано значение синего цвета");
            case 3 -> System.out.println("Выбрано значение коричневого цвета");
            default -> System.out.println("Выбрано значение желтого цвета");
        }
        System.out.println("Вывод программы не останавливается");
    }
}
