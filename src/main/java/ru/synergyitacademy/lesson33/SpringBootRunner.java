package ru.synergyitacademy.lesson33;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.synergyitacademy.lesson33.service.SelfInjectedService;

@SpringBootApplication
public class SpringBootRunner {

    public static void main(String[] args) {
        final ConfigurableApplicationContext context =
                SpringApplication.run(SpringBootRunner.class, args);
        final SelfInjectedService bean = context.getBean(SelfInjectedService.class);
        bean.printApplication();
    }
}
