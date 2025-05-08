package com.pluralsight;

public class Player {
    private String name;
    private Hand hand;

    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
    }

    public String getName() {
        return name;
    }

    public Hand getHand() {
        return hand;
    }

    public int getScore(){
        return hand.getValue();
    }

    public void showHand() {
        System.out.println(name + " Hand");
        for (int i =0; i<hand.getSize(); i++) {
            Card card = hand.getCard(i);
            card.flip();
            System.out.println(" - " + card );
            card.flip();
        }
        System.out.println("Score: " + getScore() + "\n");
    }

}
