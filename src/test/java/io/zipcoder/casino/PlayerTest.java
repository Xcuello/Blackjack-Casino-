package io.zipcoder.casino;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class PlayerTest {

    Player xzavia;

    @Before
    public void setup() {

        xzavia = new Player("Xzavia", 10_000.00);

    }

    @Test
    public void addCardTest() {

        //Given

        Card expected = new Card(Suit.SPADE, Rank.Jack);

        //When
        xzavia.addCard(expected);
        Card actual = xzavia.getHand().getCards().get(0);

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getHandTest() {

        //Given
        Hand expected = new Hand();
        xzavia.setHand(expected);

        //When
        Hand actual = xzavia.getHand();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getWalletAmountAfterWagerTest() {

        //When
        xzavia.setWager(1000.00);

        double expected = 9000.00;

        double actual = xzavia.getWalletAmount();

        //Then
        Assert.assertEquals(expected, actual, 0);

    }
}
