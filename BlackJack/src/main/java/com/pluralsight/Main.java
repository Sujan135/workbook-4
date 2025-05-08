package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Player 1 name: ");
        String name1 = scanner.nextLine();
        System.out.println("Enter Player 2 name: ");
        String name2 = scanner.nextLine();

        Player player1 = new Player(name1);
        Player player2 = new Player(name2);

        Deck deck = new Deck();
        deck.shuffle();

        System.out.println("Deck is shuffled. ready to deal");

    }
}
