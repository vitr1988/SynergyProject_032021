package ru.synergyitacademy.lesson32;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.synergyitacademy.lesson32.config.AppConfiguration;
import ru.synergyitacademy.lesson32.service.CalculationService;
import ru.synergyitacademy.lesson32.service.FoodService;
import ru.synergyitacademy.lesson32.service.PrintService;

public class SpringApplicationRunner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        final PrintService printService = context.getBean(PrintService.class);
        printService.print("Hello from Spring Application");

        final PrintService printService2 = context.getBean(PrintService.class);
        printService2.print("Hello from Spring Application");

        final CalculationService calculationService = context.getBean(CalculationService.class);
        calculationService.summa(5, 10);

        final FoodService foodService = context.getBean(FoodService.class);
        foodService.feed();

        final FoodService foodService2 = context.getBean(FoodService.class);
        foodService2.feed();
    }
}
