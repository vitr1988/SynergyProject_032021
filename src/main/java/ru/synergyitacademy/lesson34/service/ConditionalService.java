package ru.synergyitacademy.lesson34.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.synergyitacademy.lesson34.config.ApplicationProperties;

@Slf4j
@Service
@RequiredArgsConstructor
public class ConditionalService {

    private final ApplicationProperties applicationProperties;

    public void print() {
        log.info("Application properties value {} url {}",
                applicationProperties.getValue(),
                applicationProperties.getSetting().getUrl());
    }
}
