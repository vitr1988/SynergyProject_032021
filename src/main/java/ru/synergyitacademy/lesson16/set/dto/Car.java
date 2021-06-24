package ru.synergyitacademy.lesson16.set.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
import java.util.Objects;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Car /*implements Comparable<Car>*/ {

    private final String brand;
    private String model;
    private BigDecimal price;

//    @Override
    public int compareTo(Car o) {
        String myBrandName = Objects.requireNonNull(this.brand);
        return Objects.equals(myBrandName, o.brand) ? 0 : myBrandName.compareTo(o.brand);
    }
}
