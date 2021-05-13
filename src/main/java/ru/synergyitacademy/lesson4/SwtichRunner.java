package ru.synergyitacademy.lesson4;

import java.util.Scanner;

public class SwtichRunner {

    public static void main(String[] args) {
        double a = 0, b = 0, c = 0;
        double x = -b / (2 * a);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение, которое ассоциируется с цветом : ");
        switch (scanner.nextInt()) {
            case 1:
            case 5:
            case 4: {
                System.out.println("Выбрано значение белого цвета");
                break;
            }
            case 2: {
                System.out.println("Выбрано значение синего цвета");
                break;
            }
            case 3: {
                System.out.println("Выбрано значение коричневого цвета");
                break;
            }
            default: {
                System.out.println("Выбрано значение желтого цвета");
                break;
            }
        }
        System.out.println("Вывод программы не останавливается");
    }
}
