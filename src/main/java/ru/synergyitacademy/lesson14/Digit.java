package ru.synergyitacademy.lesson14;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Digit implements HasValue {

    @Setter
    @Even(value = -1, message = "It's odd value")
    int value;

    public void increment(@Even(0) int incrementedValue) {
        this.value += incrementedValue;
    }

}
