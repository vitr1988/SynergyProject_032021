package ru.synergyitacademy.lesson30.dao.impl;

import org.springframework.stereotype.Component;
import ru.synergyitacademy.lesson30.dao.PersonDao;

@Component
public class PersonDaoImpl implements PersonDao {

    @Override
    public void save() {
        System.out.println("save!!");
    }
}
