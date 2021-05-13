package ru.synergyitacademy.lesson3;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Для сложения нам потребуется два числа");
        System.out.println("Введите левое слагаемое: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Введите правое слагаемое: ");
        int b = scanner.nextInt();
        System.out.printf("Результат сложения двух чисел (%d и %d) равен %d",
                a, b, a + b);
    }
}
