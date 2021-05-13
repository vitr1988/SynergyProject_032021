package ru.synergyitacademy.lesson3;

public class LaunchExecutor {
    public static void main(String[] args) {
        System.out.println("Для сложения нам потребуется два числа");
        String a = args[0];
        Integer operand1 = Integer.valueOf(a);
        String b = args[1];
        Integer operand2 = Integer.valueOf(b);
        System.out.printf("Результат сложения двух чисел (%s и %s) равен %d",
                a, b, operand1 + operand2);
        int countWords = 1; // correct code conventions
        int count_words = 1; // wrong style
    }
}
