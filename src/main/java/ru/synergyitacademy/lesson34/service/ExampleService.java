package ru.synergyitacademy.lesson34.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Slf4j
@Service
//@Profile("local")
@ConditionalOnProperty(value = "application.value", havingValue = "123")
@ConditionalOnBean(ConditionalService.class)
public class ExampleService {

    @Value("${application.value}")
    private String value;

    @Value("${spring.application.name}")
    private String applicationName;

    public void print() {
        log.info("ExampleService#print() {} {}", value, applicationName);
    }
}
