package ru.synergyitacademy.lesson36;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"ru.synergyitacademy.lesson35.config", "ru.synergyitacademy.lesson36"})
public class ShellRunner {

    public static void main(String[] args) {
        SpringApplication.run(ShellRunner.class, args);
    }
}
