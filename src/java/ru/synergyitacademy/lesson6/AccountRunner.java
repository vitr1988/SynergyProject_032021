package ru.synergyitacademy.lesson6;

public class AccountRunner {
    public static void main(String[] args) {
        Account account = new Account("1654165454153", "Ivan", 100_000);
        System.out.println(account.accountNumber);
        System.out.println(account.balance);
        System.out.println(account.flag);
        account.withdraw(120_000);
        System.out.println(account.balance);

        System.out.println("-------");

        Account personalAccount = new PersonalAccount();
        System.out.println(personalAccount.accountNumber);
        System.out.println(personalAccount.balance);
        System.out.println(personalAccount.flag);
        personalAccount.withdraw(120_000);
        System.out.println(personalAccount.balance);

        Account legalAccount = new LegalAccount();
        legalAccount.withdraw(500_000);

        if (personalAccount instanceof PersonalAccount) {
            ((PersonalAccount) personalAccount).withdraw(100_000);
        } else if (personalAccount instanceof LegalAccount) {
            ((LegalAccount) personalAccount).withdraw(100_000);
        } else {
            personalAccount.withdraw(100_000);
        }

        System.out.println(personalAccount == legalAccount);
    }
}
