package ru.synergyitacademy.lesson29;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Calculator {

    private int a;
    private int b;

    public int summa() {
        return a + b;
    }

    public int subtract() {
        return a - b;
    }

    public int division() {
        return a / b;
    }

    public int multiply() {
        return a * b;
    }
}
