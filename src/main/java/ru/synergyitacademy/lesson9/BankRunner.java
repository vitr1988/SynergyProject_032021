package ru.synergyitacademy.lesson9;

import ru.synergyitacademy.lesson9.Bank.Account;
import ru.synergyitacademy.lesson9.Bank.Client;

import java.math.BigDecimal;

public class BankRunner {

    public static void main(String[] args) throws CloneNotSupportedException {
        Bank bank = new Bank("VTB", "065106");

        Account account = bank.new Account();
        Account newAccount = bank.new Account();
        bank.setAccounts(account, newAccount);

        Client client = new Client();

        Bank.Payable payable = new Bank.Payable() {
            @Override
            public void pay(BigDecimal purchase) {

            }
        };

        Bank anotherBank = bank.clone();
        System.out.println(account);
        System.out.println(newAccount);
        System.out.println(anotherBank);
    }
}
