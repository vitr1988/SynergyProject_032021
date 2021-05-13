package ru.synergyitacademy.lesson7;

public abstract class Animal {

    public static final Long MAX_AMOUNT = 11651454L;

    private final String animalType;
    private int age;
    public static int amount;

    public Animal(String type) {
        this.animalType = type;
        this.age = 0;
        amount++;
    }

    public Animal(String type, int age) {
        this(type);
        this.age = age;
    }

    final void voice() { //default-package
        if (checkAge()) {
            System.out.println("This animal can " + toString());
        } else {
            System.out.println("Check if this animal is alive or born");
        }
    }

    protected void beOlder() {
        if (checkAge()) {
            age++;
        }
    }

    private boolean checkAge() {
        return !(this.age <= 0 || this.age >= 50);
    }

    public String toString() {
        switch (animalType) {
            case "кошка":
                return "мяукать";
            case "собака":
                return "гавкать";
            default:
                return "ничего не делать";
        }
    }

    public void feed(Animal animal) {
        kill(animal);
    }

    public void feed(Person person) {
        person.feed(this);
    }

    public static void kill(Animal animal) {
//        this.age
        animal.age = 0;
    }

    public abstract void jump();
}
