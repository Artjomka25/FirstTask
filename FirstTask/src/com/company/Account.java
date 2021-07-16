package com.company;

public class Account {
    private final int id;
    private int money;

    Account(int id, int money) {
        this.id = id;
        this.money = money;
    }

    public boolean transfer(Account recipient, int transferAmount) {
        if (transferAmount > 0 && money >= transferAmount) {
            money -= transferAmount;
            recipient.money += transferAmount;
            return true;
        } else {
            return false;
        }
    }

    public boolean withdraw(int withdrawalAmount) {
        if (withdrawalAmount > 0 && money >= withdrawalAmount) {
            money -= withdrawalAmount;
            return true;
        } else {
            return false;
        }
    }

    public int getMoney() {
        return this.money;
    }

    public int getId() {
        return this.id;
    }

    public void infoAccountStatus() {
        System.out.println("Состояние счёта " + id + " = " + money + "руб");
    }
}