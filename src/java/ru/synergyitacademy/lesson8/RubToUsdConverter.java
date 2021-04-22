package ru.synergyitacademy.lesson8;

public class RubToUsdConverter implements Convertable {

    @Override
    public long convert(long summa) {
        return summa / USD_RUB;
    }
}
