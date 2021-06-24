package ru.synergyitacademy.lesson16.set;

import ru.synergyitacademy.lesson16.set.dto.Car;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

    public static void main(String[] args) {
        Set<Car> cars = new HashSet<>();
        cars.add(new Car("Skoda", "Octavia", new BigDecimal("2000000")));
        cars.add(new Car("Volkswagen", "Golf", new BigDecimal("2500000")));
        cars.add(new Car("Lada", "Granta", new BigDecimal("500000")));
        cars.add(new Car("Lada", "Granta", new BigDecimal("500000")));
//        System.out.println(cars);

        Set<Car> linkedCars = new LinkedHashSet<>();
        linkedCars.add(new Car("Skoda", "Octavia", new BigDecimal("2000000")));
        linkedCars.add(new Car("Volkswagen", "Golf", new BigDecimal("2500000")));
        linkedCars.add(new Car("Lada", "Granta", new BigDecimal("500000")));
        linkedCars.add(new Car("Lada", "Granta", new BigDecimal("500000")));
        linkedCars.add(new Car("BMW", "3", new BigDecimal("3500000")));
//        System.out.println(linkedCars);

//        Set<Car> sortedSet = new TreeSet<>();
//        sortedSet.add(new Car("Skoda", "Octavia", new BigDecimal("2000000")));
//        sortedSet.add(new Car("Volkswagen", "Golf", new BigDecimal("2500000")));
//        sortedSet.add(new Car("Lada", "Granta", new BigDecimal("500000")));
//        sortedSet.add(new Car("Audi", "A4", new BigDecimal("4000000")));
//        System.out.println(sortedSet);

        Set<Car> anotherSortedSet = new TreeSet<>(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return Objects.equals(o1.getBrand(), o2.getBrand()) ? 0 : o1.getBrand().compareTo(o2.getBrand());
            }
        });
        anotherSortedSet.add(new Car("Skoda", "Octavia", new BigDecimal("2000000")));
        anotherSortedSet.add(new Car("Volkswagen", "Golf", new BigDecimal("2500000")));
        anotherSortedSet.add(new Car("Lada", "Granta", new BigDecimal("500000")));
        anotherSortedSet.add(new Car("Audi", "A4", new BigDecimal("4000000")));
        System.out.println(anotherSortedSet);

//        Set<String> sortedStringSet = new TreeSet<>();
//        sortedStringSet.add("Hello");
//        sortedStringSet.add("Привет");
//        sortedStringSet.add("Aloha");
//        System.out.println(sortedStringSet);

    }
}
