package io.zipcoder.casino;

import org.junit.Assert;
import org.junit.Test;

public class TestCard {

    @Test
    public void getSuitTest(){
        //Given
        Card aceOfSpade = new Card(Suit.SPADE, Rank.Ace);
        Suit expectedSuit = Suit.SPADE;
        //When
        Suit actualSuit = aceOfSpade.getSuit();
        //Then
        Assert.assertEquals(expectedSuit, actualSuit);
    }

    @Test
    public void getRankTest(){
        //Given
        Card twoOfHearts = new Card(Suit.HEART, Rank.Two);
        Rank expectedRank = Rank.Two;
        //When
        Rank actualRank = twoOfHearts.getRank();
        //Then
        Assert.assertEquals(expectedRank, actualRank);
    }

    @Test
    public void getValueTest(){
        //Given
        Card jackOfClub = new Card(Suit.CLUB, Rank.Jack);
        Integer expectedValue = 10;
        //When
        Integer actualValue = Rank.Jack.primaryValue;
        //Then
        Assert.assertEquals(expectedValue, actualValue);
    }
}
