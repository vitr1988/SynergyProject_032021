package ru.synergyitacademy.lesson7.inner;

import ru.synergyitacademy.lesson7.Animal;

public final class Tiger extends Animal {

    public Tiger() {
        super("тигр");
    }

    public Tiger(int age) {
        super("тигр", age);
        beOlder();
    }

    @Override
    public void jump() {
        
    }
}
