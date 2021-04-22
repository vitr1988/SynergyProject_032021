package ru.synergyitacademy.lesson8;

public class ConverterRunner {

    public static void main(String[] args) {
        Convertable usdToRubConverter = new UsdToRubConverter();
        int baxes = 100;
        System.out.printf("%d dollars equals %d rubles\n", baxes, usdToRubConverter.convert(baxes));

        Convertable rubToEurConverter = new RubToEurConverter();
        Convertable eurToRubConverter = new EurToRubConverter();
        int rubles = 10_000;
        long euros = rubToEurConverter.convert(rubles);
        System.out.printf("%d rubles equals %d euros and the rest is %d rubles\n", rubles, euros, rubles - eurToRubConverter.convert(euros));

        eurToRubConverter = Convertable.getConverter(Valutes.RUB_EUR);
        long sameEuros = eurToRubConverter.convert(rubles);
        System.out.printf("%d rubles equals %d euros and the rest is %d rubles\n", rubles, sameEuros, rubles - Convertable.getConverter(Valutes.EUR_RUB).convert(euros));
    }
}
