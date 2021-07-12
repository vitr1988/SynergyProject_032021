package ru.synergyitacademy.lesson21;

import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@RequiredArgsConstructor
public class Account {

    private final String owner;

    private BigDecimal balance = BigDecimal.ZERO;

    public void withdraw(BigDecimal b) {
        balance = balance.subtract(b);
    }

    public void deposit(BigDecimal b) {
        balance = balance.add(b);
    }

    public BigDecimal getBalance() {
        return this.balance;
    }
}
