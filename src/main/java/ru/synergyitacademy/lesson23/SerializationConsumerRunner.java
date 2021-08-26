package ru.synergyitacademy.lesson23;

import ru.synergyitacademy.lesson23.dto.Person;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationConsumerRunner {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\temp\\person.dat"))) {
            Person person = (Person) ois.readObject();
            System.out.println(person);
        }
    }
}
