package io.zipcoder.casino;

public enum  Suit {
    SPADE("♤"),
    HEART("♥"),
    CLUB("♧"),
    DIAMOND("♢");

    private final String symbol;

    Suit(String symbol) {

        this.symbol = symbol;
    }
}
