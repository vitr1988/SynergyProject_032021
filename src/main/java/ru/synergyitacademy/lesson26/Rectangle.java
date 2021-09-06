package ru.synergyitacademy.lesson26;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Rectangle implements Figure {

    private int a;
    private int b;

    public int square() {
        return a * b;
    }

}
