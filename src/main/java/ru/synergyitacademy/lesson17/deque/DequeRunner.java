package ru.synergyitacademy.lesson17.deque;

import ru.synergyitacademy.lesson16.set.dto.Car;

import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class DequeRunner {

    public static void main(String[] args) {
        Deque<Car> cars = new ArrayDeque<>();
        cars.add(new Car("Skoda", "Octavia", new BigDecimal("2000000")));
        cars.add(new Car("Volkswagen", "Golf", new BigDecimal("2500000")));
        cars.add(new Car("Lada", "Granta", new BigDecimal("500000")));
        cars.add(new Car("Audi", "A4", new BigDecimal("4000000")));

        Car car;
        while ((car = cars.peek()) != null) {
            System.out.println(cars.poll());
        }
    }
}
