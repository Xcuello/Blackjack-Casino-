package io.zipcoder.casino;

public enum Rank {
    Ace(1,11),
    Two(2),
    Three(3),
    Four(4),
    Five(5),
    Six(6),
    Seven(7),
    Eight(8),
    Nine(9),
    Ten(10),
    Jack(10),
    Queen(10),
    King(10);

    final Integer primaryValue;
    final Integer secondaryValue;

    Rank(Integer primaryValue, Integer secondaryValue) {
        this.primaryValue = primaryValue;
        this.secondaryValue = secondaryValue;

    }

    Rank(Integer primaryValue) {
        this.primaryValue = primaryValue;
        this.secondaryValue = primaryValue;
    }
}
