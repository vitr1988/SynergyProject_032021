package ru.synergyitacademy.lesson32.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import ru.synergyitacademy.lesson32.service.CalculationService;
import ru.synergyitacademy.lesson32.service.FoodService;
import ru.synergyitacademy.lesson32.service.PrintService;
import ru.synergyitacademy.lesson32.service.impl.PrintServiceImpl;

@Configuration
@ComponentScan("ru.synergyitacademy.lesson32")
public class AppConfiguration {

    @Bean
    @Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
    public PrintService printService(CalculationService service, FoodService foodService) {
        return new PrintServiceImpl(service, foodService);
    }
}
