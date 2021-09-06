package ru.synergyitacademy.lesson26;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Quadrat implements Figure {

    private int b;

    public int square() {
        return getB() * getB();
    }
}
