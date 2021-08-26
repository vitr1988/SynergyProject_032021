package ru.synergyitacademy.lesson23;

import ru.synergyitacademy.lesson23.dto.Person;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;

public class SerializationProducerRunner {

    public static void main(String[] args) throws IOException {
        Person ivanov = new Person("Ivanov", 1, new BigDecimal("100000"));
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\temp\\person.dat"))) {
            oos.writeObject(ivanov);
        }

    }
}
