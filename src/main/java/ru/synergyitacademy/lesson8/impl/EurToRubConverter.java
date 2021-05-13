package ru.synergyitacademy.lesson8.impl;

import ru.synergyitacademy.lesson8.Convertable;

public class EurToRubConverter implements Convertable {

    @Override
    public long convert(long summa) {
        return summa * EUR_RUB;
    }
}
