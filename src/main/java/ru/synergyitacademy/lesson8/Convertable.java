package ru.synergyitacademy.lesson8;

@FunctionalInterface
public interface Convertable {

    /*public static final */ int USD_RUB = 76;

    /*public static final */ int EUR_RUB = 88;

    /*public abstract */ long convert(long summa);

    default void print(long summa) {
        System.out.printf("Converted summa %d", convert(summa));
    }

    static Convertable getConverter(Valutes valutes) {
        return valutes.getConverter();
    }
}
