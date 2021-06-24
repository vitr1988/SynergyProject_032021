package ru.synergyitacademy.lesson16.queue;

import ru.synergyitacademy.lesson16.set.dto.Car;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueRunner {
    public static void main(String[] args) {
        Queue<Car> cars = new ArrayDeque<>();
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
