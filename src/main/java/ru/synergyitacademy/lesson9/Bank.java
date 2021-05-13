package ru.synergyitacademy.lesson9;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

public class Bank implements Cloneable {

    private final String name;
    private final String bic;

    private Account[] accounts;

    public Bank(String name, String bic) {
        this.name = name;
        this.bic = bic;
    }

    public String getName() {
        return name;
    }

    public String getBic() {
        return bic;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account... accounts) {
        this.accounts = accounts;
    }

    public Bank clone() throws CloneNotSupportedException {
        Bank newBank = (Bank) super.clone();
        Account[] newAccounts = new Account[newBank.accounts.length];
        for (int i = 0; i < newBank.accounts.length; i++) {
            newAccounts[i] = newBank.accounts[i].clone();
//            newAccounts[i].client = newAccounts[i].client.clone();
        }
        newBank.setAccounts(newAccounts);
        return newBank;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", bic='" + bic + '\'' +
                ", accounts=" + Arrays.toString(accounts) +
                '}';
    }

    class Account implements Payable, Cloneable {
        private String accountNumber;
        private Client client;
        private BigDecimal summa = BigDecimal.ZERO;

        @Override
        public void pay(BigDecimal purchase) {
            summa = summa.subtract(purchase);
        }

        public Account clone() throws CloneNotSupportedException {
            return (Account) super.clone();
        }
    }

    static class Client {
        private String fio;
        private LocalDate birthday;
    }

    interface Payable {
        void pay(BigDecimal purchase);
    }

}
