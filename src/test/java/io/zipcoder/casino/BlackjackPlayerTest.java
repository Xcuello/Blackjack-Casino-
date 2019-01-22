package io.zipcoder.casino;

import io.zipcoder.casino.BlackjackPlayer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BlackjackPlayerTest {

    BlackjackPlayer blackjackPlayer;

    @Before
    public void setup() {

        blackjackPlayer = new BlackjackPlayer("Xzavia", 200.00);

    }

    @Test
    public void setWagerTest() {

        //When
        double actual = 100.00;

        blackjackPlayer.setWager(100.00);

        double expected = blackjackPlayer.getWager();

        //Then
        Assert.assertEquals(expected, actual, 0);

    }

    @Test
    public void getNameTest() {

        //When
        String expected = "Xzavia";

        String actual = blackjackPlayer.getName();

        //Then
        assertEquals(expected, actual);

    }


}
