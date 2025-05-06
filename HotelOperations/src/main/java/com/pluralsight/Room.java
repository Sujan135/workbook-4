package com.pluralsight;

public class Room {
    private final int numberOfBeds;
    private final double price;
    private boolean occupied;
    private boolean dirty;

    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isAvailable() {
        return !this.occupied && !this.dirty;
    }

    public void checkIn() {
        if (isAvailable()) {
            this.occupied = true;
            this.dirty = true;
            System.out.println("Checked in ....");
        } else {
            System.out.println("Not available for check in ");
        }
    }

    public void checkOut() {
        if (this.occupied) {
            this.occupied = false;
            System.out.println("Checked out ....");
        }else {
            System.out.println("Room is empty");
        }
    }

    public void cleanRoom() {
        if (!this.occupied) {
            this.dirty = false;
            System.out.println("Room is cleaned");
        } else {
            System.out.println("Room is not empty to clean");
        }
    }

}
