package ru.synergyitacademy.lesson32.service.impl;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import ru.synergyitacademy.lesson32.service.CalculationService;
import ru.synergyitacademy.lesson32.service.PrintService;

@Service
public class CalculationServiceImpl implements CalculationService {

    private final PrintService printService;

    public CalculationServiceImpl(@Lazy PrintService printService) {
        this.printService = printService;
    }

    @Override
    public int summa(int a, int b) {
        final int i = a + b;
        printService.print(i + "");
        return i;
    }
}
