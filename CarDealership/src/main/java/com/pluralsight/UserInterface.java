package com.pluralsight;

import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;

    public void display() {
        DealershipFileManager fileManager = new DealershipFileManager();
        dealership = fileManager.getDealerShip();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int command = scanner.nextInt();

            switch (command) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Exiting..");
                    scanner.close();
                    break;
                default:
                    System.out.println("Invalid command. Try again.");
                    break;
            }
        }
    }


    private void displayMenu() {
        System.out.println("-- Dealership Menu --");
        System.out.println("1. View all vehicles");
        System.out.println("2. View vehicles by price range");
        System.out.println("3. View vehicles by make/model");
        System.out.println("4. Exit");
        System.out.println(" Enter your command");
    }
}
