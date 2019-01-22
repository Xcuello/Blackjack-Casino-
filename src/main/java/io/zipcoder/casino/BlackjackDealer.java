package io.zipcoder.casino;

import java.util.*;

public class BlackjackDealer extends BlackjackPlayer {
    private BlackjackPlayer player;
    private Hand hand;
    private Deck deck;

    public BlackjackDealer(String name, double moneyStartedWith) {

        super(name, moneyStartedWith);
    }

//    private BlackjackDealer(Hand hand, Deck deck) {
//
//        this.hand = hand;
//        this.deck = deck;
//    }
//
//
//        public Card hit(){
//            Card c = dealCards();
//            hand.add(c);
//            return c;
//        }
//
//        public Card dealCards() {
//            Card c = deck.remove();
//            return c;
//        }
//
//        public void newDeck(){
//
//        if (deck.isEmpty()){
//
//            deck = Deck.createDeck();
//            }
//        }


        public Hand viewHand(){

        return hand;
        }

        public void takeBet(Player player,double money){

        }
    }

