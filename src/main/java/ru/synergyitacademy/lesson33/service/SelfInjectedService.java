package ru.synergyitacademy.lesson33.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SelfInjectedService {

    @Value("${spring.application.name}")
    private String applicationName;

    private final SelfInjectedService self;

    public SelfInjectedService(@Lazy SelfInjectedService self) {
        this.self = self;
    }

    public void print(String str) {
        System.out.println(str);
    }

    public void printApplication() {
        self.print(applicationName);
        log.info(applicationName);
    }
}
