package ru.synergyitacademy.lesson33;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.synergyitacademy.lesson33.config.ApplicationConfiguration;
import ru.synergyitacademy.lesson33.service.SelfInjectedService;

public class SpringApplicationRunner {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        final SelfInjectedService service = context.getBean(SelfInjectedService.class);
        service.printApplication();
    }
}
