package ru.synergyitacademy.lesson8.another;

import ru.synergyitacademy.lesson8.A;

public class B extends A {

    public void anotherM() {
        String str = "test";
        System.out.println(str);
        m(str);
        System.out.println(str);
    }

    @Override
    protected void m(String str) {
        str = "Hello";
    }

    public D modify(D d) {
        D newD = new D();
        newD.inc();
        return newD;
    }

    public void print() {
        System.out.println("Это я - класс B");
    }
}
