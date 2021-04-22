package ru.synergyitacademy.lesson8;

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
