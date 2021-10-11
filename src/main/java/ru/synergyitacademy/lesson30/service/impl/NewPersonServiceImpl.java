package ru.synergyitacademy.lesson30.service.impl;

import org.springframework.stereotype.Component;
import ru.synergyitacademy.lesson30.service.PersonService;

//@Primary
@Component("newPersonService")
public class NewPersonServiceImpl implements PersonService {

    @Override
    public void print() {
        System.out.println("new person print");
    }
}
