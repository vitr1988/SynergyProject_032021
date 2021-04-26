package ru.synergyitacademy.lesson8;

import ru.synergyitacademy.lesson8.impl.EurToRubConverter;
import ru.synergyitacademy.lesson8.impl.RubToEurConverter;
import ru.synergyitacademy.lesson8.impl.RubToUsdConverter;
import ru.synergyitacademy.lesson8.impl.UsdToRubConverter;

public enum Valutes {
    EUR_RUB(new EurToRubConverter()),
    RUB_EUR(new RubToEurConverter()),
    USD_RUB(new UsdToRubConverter()),
    RUB_USD(new RubToUsdConverter());

    private Convertable converter;

    Valutes(Convertable convertable) {
        this.converter = convertable;
    }

    public Convertable getConverter() {
        return this.converter;
    }
}
