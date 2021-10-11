package ru.synergyitacademy.lesson31;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;
import ru.synergyitacademy.lesson31.config.JavaConfiguration;
import ru.synergyitacademy.lesson31.config.service.PropertyService;

import java.sql.Connection;
import java.util.Collections;

public class SpringJavaBasedRunner {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(JavaConfiguration.class);
        context.refresh();
//        AbstractApplicationContext context = new AnnotationConfigApplicationContext(StaticConfiguration.class);
        final User user = (User) context.getBean("admin");
        System.out.println(user.canWrite());

        final User guest = (User) context.getBean("guest");
        System.out.println(guest.canWrite());

        Connection connection = context.getBean(Connection.class);
        System.out.println("Connect is established " + connection != null);

        final PropertyService propertyService = context.getBean(PropertyService.class);
        System.out.println(propertyService.getApplicationName());
    }

    @Configuration
    static class StaticConfiguration {
        @Bean
        public User admin() {
            final User petrov = new User(3L, "Petrov");
            petrov.setRights(Collections.emptyList());
            return petrov;
        }
    }
}
