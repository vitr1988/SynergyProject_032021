package ru.synergyitacademy.lesson6;

public class Account { // extends Object

    String accountNumber = "Test";
    String clientName = "Test";
    double balance = 25;
    String bankName = "VTB";
    char symbol = '\u0000';
    boolean flag = true;

    {

    }

    public Account() {

    }

    public Account(String accountNumber, String clientName, double balance) {
        this.accountNumber = accountNumber;
        this.clientName = clientName;
        this.balance = balance;
    }

    public Account(String accountNumber, String clientName, double balance, String bankName, char symbol, boolean flag) {
        this.accountNumber = accountNumber;
        this.clientName = clientName;
        this.balance = balance;
        this.bankName = bankName;
        this.symbol = symbol;
        this.flag = flag;
    }

    public void withdraw(double money) {
        this.balance -= money;
    }

    public void withdraw(double money, String str) {
        this.balance -= money;
    }

    public void deposit(double money) {
        this.balance += money;
    }
}
