package ru.synergyitacademy.lesson17.map;

import ru.synergyitacademy.lesson16.set.dto.Car;
import ru.synergyitacademy.lesson8.interf.B;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class MapRunner {
    public static void main(String[] args) {
        Map<Integer, String> cityDictionary = new HashMap<>();
        cityDictionary.put(63, "Samara");
        cityDictionary.put(64, "Saratov");
        cityDictionary.put(77, "Kazan");
        cityDictionary.put(77, "Moscow");
        cityDictionary.put(78, "Saint-Petersburg");
        cityDictionary.put(-1, null);

        for (Map.Entry<Integer, String> entry : cityDictionary.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value : " + entry.getValue());
        }

        System.out.println(cityDictionary.get(78));

        if (cityDictionary.containsKey(16)) {
            System.out.println(cityDictionary.get(16));
        }


        Map<Car, BigDecimal> cars = new HashMap<>();
        Car rapid = new Car("Skoda").setModel("Rapid");
        cars.put(rapid, new BigDecimal("1200000"));
        cars.put(new Car("Lada").setModel("12"), new BigDecimal("100000"));
        cars.put(new Car("Suzuki").setModel("Grand Vitara"), new BigDecimal("2000000"));

        System.out.println(cars.get(rapid));
        System.out.println(cars.get(new Car("Volkswagen")));
//        System.out.println(cars.get(rapid.setPrice(new BigDecimal("1200000"))));

        cars.remove(rapid);
        System.out.println(cars);

        System.out.println(cars.containsValue(new BigDecimal("100000")));
        System.out.println(cars.size());
    }
}
