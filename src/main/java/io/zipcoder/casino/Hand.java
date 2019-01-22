package io.zipcoder.casino;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private  List<Card> cards = new ArrayList<Card>();

    public void clear(){

        cards.clear();
    }

    public void add(Card c){
        if(cards == null)
            throw new NullPointerException ("no cards in hand, add new card");
            cards.add(c);
    }


    public Integer getValue(){
       Integer sum = 0;
       for(Card card: cards){
        sum+= card.getValue();
       }
        return sum;
    }


    public List<Card> getCards() {

        return cards;
    }

    public void setCards(List<Card> cards) {

        this.cards = cards;
    }

    public boolean contains(Card card){

        return this.cards.contains(card);
    }
}
