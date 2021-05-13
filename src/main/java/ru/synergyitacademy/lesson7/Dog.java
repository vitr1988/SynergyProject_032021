package ru.synergyitacademy.lesson7;

public class Dog extends Animal {

    public Dog() {
        super("собака");
    }

    public Dog(int age) {
        super("кошка", age);
    }

    @Override
    public void jump() {

    }

//    @Override
//    public void voice() {
//        System.out.println("Собака умеет гавкать");
//    }
}
