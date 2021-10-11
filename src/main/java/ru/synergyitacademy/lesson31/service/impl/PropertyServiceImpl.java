package ru.synergyitacademy.lesson31.config.service.impl;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ru.synergyitacademy.lesson31.config.service.PropertyService;

@Service
public class PropertyServiceImpl implements PropertyService {

    @Getter
    @Value("${spring.application.name}")
    private String applicationName;
}
