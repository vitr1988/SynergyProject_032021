package ru.synergyitacademy.lesson12;

public class ExceptionRunner {

    public static void main(String[] args) {
        try {
            calculate();
        } catch (CustomRuntimeException e) {
            e.printStackTrace();
        }
    }

    private static void calculate() {
        Long value = -125L;
        if (value > 0) {
            System.out.println(value);
        } else {
            throw new CustomRuntimeException();
        }
    }
}
