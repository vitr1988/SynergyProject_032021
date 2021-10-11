package ru.synergyitacademy.lesson30.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.synergyitacademy.lesson30.dao.PersonDao;
import ru.synergyitacademy.lesson30.service.PersonService;

@RequiredArgsConstructor
@Component("personService")
public class PersonServiceImpl implements PersonService {

    private final PersonDao personDao;

    @Override
    public void print() {
        personDao.save();
    }
}
