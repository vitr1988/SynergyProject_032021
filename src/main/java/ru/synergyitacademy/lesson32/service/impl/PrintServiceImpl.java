package ru.synergyitacademy.lesson32.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.synergyitacademy.lesson32.service.CalculationService;
import ru.synergyitacademy.lesson32.service.FoodService;
import ru.synergyitacademy.lesson32.service.PrintService;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Service
@RequiredArgsConstructor
public class PrintServiceImpl implements PrintService {

    private final CalculationService calculationService;
    private final FoodService foodService;

    @PostConstruct
    public void init() {
        System.out.println("Init print service");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroy print service");
    }

    @Override
    public void print(String str) {
        System.out.println(str);
        foodService.feed();
    }
}
