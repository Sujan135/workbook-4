package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        String[] suits = {"Hearts", "Spades", "Diamonds", "Clubs"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "K", "A"};

        for (String suit: suits) {
            for (String value : values) {
                cards.add(new Card(suit,value));
            }
        }
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }


    public Card deal() {
        if (cards.size() > 0) {
            Card card = cards.remove(0);
            return card;
        } else {
            return null;
        }
    }

    public int getSize() {
        return cards.size();
    }
}
