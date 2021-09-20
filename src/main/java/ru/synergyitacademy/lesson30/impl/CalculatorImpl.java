package ru.synergyitacademy.lesson30.impl;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.synergyitacademy.lesson30.Calculator;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CalculatorImpl implements Calculator {

    private int a;
    private int b;

    @Override
    public int summa() {
        return a + b;
    }

    @Override
    public int multiply() {
        return a * b;
    }
}
