package ru.synergyitacademy.lesson6;

public class PersonalAccount extends Account {

    String clientCode;
    String inn;

    public PersonalAccount() {
        super("TestAccountNumber", "TestClient", 50_000);
        this.clientCode = "RandomCode";
        this.inn = "4545645";
    }

    public String getClientCode() {
        return clientCode;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    @Override
    public void withdraw(double money) {
        if (balance >= money) {
            super.withdraw(money);
        } else {
            System.out.println("Снимаемая сумма не может превышать текущий баланс лицевого счета");
        }
    }
}
