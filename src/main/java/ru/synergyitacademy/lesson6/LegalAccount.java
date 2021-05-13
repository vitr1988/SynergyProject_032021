package ru.synergyitacademy.lesson6;

public class LegalAccount extends Account {

    @Override
    public void withdraw(double money) {
        System.out.println("Снятие денежных средств со счетов юр лиц запрещен!");
    }
}
