package io.zipcoder.casino;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Deck {

    private static Suit Suit;
    private static Rank Rank;
    private Stack<Card> deck;


    public Deck(){
        this.deck = new Stack<Card>();
        for (Suit suit : Suit.values()){
            for (Rank rank : Rank.values()){
                deck.push(new Card(suit, rank));
            }
        }
    }


    public Integer size(){

        return deck.size();
    }

    public Card popCard(){

        return deck.pop();
    }

    public Card pushCard(Card card){

        return deck.push(card);
    }

    public boolean isEmpty(){
        return deck.isEmpty();

    }

    public void shuffleDeck(Stack<Card> deck){

        Collections.shuffle(deck);

    }

//    public void peek(Card card){
//        return deck.peek();
//
//}
}
