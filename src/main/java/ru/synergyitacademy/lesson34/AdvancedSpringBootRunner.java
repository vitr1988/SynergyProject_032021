package ru.synergyitacademy.lesson34;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import ru.synergyitacademy.lesson34.service.ConditionalService;
import ru.synergyitacademy.lesson34.service.ExampleService;

@EnableConfigurationProperties
@SpringBootApplication//(exclude = {DataSourceAutoConfiguration.class})
public class AdvancedSpringBootRunner {

    public static void main(String[] args) {
        final ConfigurableApplicationContext applicationContext = SpringApplication.run(AdvancedSpringBootRunner.class, args);
        final ExampleService exampleService = applicationContext.getBean(ExampleService.class);
        exampleService.print();

        final ConditionalService conditionalService = applicationContext.getBean(ConditionalService.class);
        conditionalService.print();
    }
}
