package io.zipcoder.casino;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class HandTest {

    @Test
    public void testAdd(){

        //Given
        Card expected = new Card(Suit.DIAMOND, Rank.Ace);
        Hand hand = new Hand();

        //When
        hand.add(expected);
        //Then
        Assert.assertTrue(hand.contains(expected));
    }

    @Test
    public void testGetValue(){

        //Given
        Card card1 = new Card(Suit.DIAMOND, Rank.Ace);
        Card card2 = new Card(Suit.SPADE, Rank.King);
        Hand hand = new Hand();
        hand.add(card1);
        hand.add(card2);
        Integer expectedValue = 11;

        //when
        Integer actual = hand.getValue();
        //then
        Assert.assertEquals(expectedValue, actual);
    }

    @Test
    public void testGetCards(){
    //Given
        Hand hand= new Hand();
        Card card1 = new Card(Suit.DIAMOND, Rank.Ace);
        Card card2 = new Card(Suit.SPADE, Rank.King);
        hand.add(card1);
        hand.add(card2);

        //When
        List<Card> s = hand.getCards();

        Assert.assertNotNull(s);
        Assert.assertTrue(s.size() == 2);




    }

    @Test
    public void testContains(){
        //Given
        Hand hand = new Hand();
        Card card1 = new Card(Suit.DIAMOND, Rank.Ace);
        hand.add(card1);

        //When
        Boolean b = hand.contains(card1);

        //Then
        Assert.assertTrue(b);
    }


}
