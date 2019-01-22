package io.zipcoder.casino;

public class Player {

    private String name;

    private Hand hand;

    private Wallet wallet;

    private double wager;


    public Player(String name, double moneyStartedWith) {

        this.hand = new Hand();

        this.name = name;

        this.wallet = new Wallet(moneyStartedWith);
    }

    public void addCard(Card card) {

        hand.add(card);
    }

    public Hand getHand() {

        return hand;
    }

    public void setHand(Hand hand) {

        this.hand = hand;
    }

    public String getName() {

        return name;
    }

    public void setWager(double money) {

        this.wager = money;

        wallet.takeMoney(money);
    }

    public double getWalletAmount() {

        return wallet.getCurrentAmount();
    }

    public double getWager() {

        return wager;
    }

}
