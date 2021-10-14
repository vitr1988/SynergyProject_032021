package ru.synergyitacademy.lesson32.service.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import ru.synergyitacademy.lesson32.service.FoodService;

import java.util.UUID;

@Scope(value = "prototype"/*, proxyMode = ScopedProxyMode.TARGET_CLASS*/)
@Service
public class FoodServiceImpl implements FoodService {

    private UUID uuid = UUID.randomUUID();

    @Override
    public void feed() {
        System.out.println("UUID: " + uuid.toString());
    }
}
