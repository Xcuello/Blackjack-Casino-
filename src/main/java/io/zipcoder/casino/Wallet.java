package io.zipcoder.casino;

public class Wallet {

    private double money;
    private Integer id;

    public Wallet(double moneyStartedWith) {

        this.money = moneyStartedWith;
    }

    public double getMoney(double money) {
        return money;
    }

    public double addMoney(double amountAwarded){
        money += amountAwarded;

        return money;
    }

    public double takeMoney(double amountRemoved){
        money -= amountRemoved;

        return money;
    }

    public double getCurrentAmount() {

        return money;
    }
}
