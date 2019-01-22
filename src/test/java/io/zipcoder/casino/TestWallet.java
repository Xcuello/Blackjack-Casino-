package io.zipcoder.casino;

import org.junit.Assert;
import org.junit.Test;

public class TestWallet {

    @Test
    public void testAddMoney(){
        //Given
        Wallet joeWallet = new Wallet(108.00);
        double expectedMoney = 120.00;
        //When
        double actualMoney = joeWallet.addMoney(12.00);
        //Then
        Assert.assertEquals(expectedMoney, actualMoney, 0);
    }

    @Test
    public void testTakeMoney(){
        //Given
        Wallet joeWallet = new Wallet(24.00);
        double expectedMoney = 12.00;
        //When
        double actualMoney = joeWallet.takeMoney(12.00);
        //Then
        Assert.assertEquals(expectedMoney, actualMoney, 0);
    }

    @Test
    public void testGetMoney(){
        //Given
        Wallet joeWallet = new Wallet(12.00);
        double expectedMoney = 12.00;
        //When
        double actualMoney = joeWallet.getCurrentAmount();
        //Then
        Assert.assertEquals(expectedMoney, actualMoney, 0);
    }

}
