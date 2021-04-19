package ru.synergyitacademy.lesson7;

import ru.synergyitacademy.lesson7.inner.Tiger;

public class AnimalLauncher {

    public static void main(String[] args) {
        final Cat cat = new Cat();
//        cat = new Cat(6);
        Animal[] animals = new Animal[]{cat, new Dog(-1)};
        for (Animal animal : animals) {
            animal.voice();
            animal.jump();
        }

        Animal tiger = new Tiger(25);
        tiger.feed(cat);

        Person myPerson = new Person();
        tiger.feed(myPerson);

        System.out.println(Animal.amount);

        Animal.kill(tiger);
    }
}
