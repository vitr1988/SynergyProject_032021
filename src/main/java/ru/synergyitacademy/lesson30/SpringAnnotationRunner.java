package ru.synergyitacademy.lesson30;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import ru.synergyitacademy.lesson30.config.ApplicationConfiguration;
import ru.synergyitacademy.lesson30.service.PersonService;

public class SpringAnnotationRunner {

    public static void main(String[] args) {
        final AbstractApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        final PersonService personService = context.getBean(PersonService.class);
        personService.print();
    }
}
