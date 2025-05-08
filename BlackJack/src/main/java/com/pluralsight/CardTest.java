package com.pluralsight;

public class CardTest {
    public static void main(String[] args) {
        Card c1 = new Card("Hearts", "A");
        Card c2  = new Card("Spades", "10");
        Card c3 = new Card("Clubs", "K");

        System.out.println(c1 + " -> " + c1.getPointValue());
        System.out.println(c2 + " -> " + c2.getPointValue());
        System.out.println(c3 + " -> " + c3.getPointValue());
    }
}
