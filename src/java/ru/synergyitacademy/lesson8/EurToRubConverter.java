package ru.synergyitacademy.lesson8;

public class EurToRubConverter implements Convertable {

    @Override
    public long convert(long summa) {
        return summa * EUR_RUB;
    }
}
