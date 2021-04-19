package ru.synergyitacademy.lesson7;

public class Cat extends Animal {

    public Cat() {
        super("кошка", 1);
//        beOlder();
    }

    public Cat(int age) {
        super("кошка", age);
    }

    @Override
    public void jump() {

    }

//    @Override
//    public void voice() {
//        System.out.println("Кошка умеет мяукать");
//    }

    static class Kitty {
    }
}
