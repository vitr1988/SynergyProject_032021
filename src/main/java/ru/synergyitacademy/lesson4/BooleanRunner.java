package ru.synergyitacademy.lesson4;

import java.util.Scanner;

public class BooleanRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение для проверки четности: ");
        int inputValue = scanner.nextInt();
        boolean even = inputValue % 2 == 0;
        if (inputValue == 0) {
            System.out.println("Неопределенное значение");
//            return;
        } else if (even) {
            System.out.println("Первоначальное значение - четное");
        } else {
            System.out.println("Первоначальное значение - нечетное");
        }
        boolean flag = true;
        boolean notFlag = !flag;
        boolean result = flag || notFlag;
        System.out.println(result);

        int splitter = 0;
        boolean value = (splitter == 0 ? 0 : inputValue / splitter) == 0 ||
                (26 % 2 == 0);
        System.out.println(value);
        if (result) { //так писать надо! !result
//        if (result == true) { так писать не надо!

        }
    }
}
