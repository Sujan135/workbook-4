package com.pluralsight;

public class Room {
    private final int numberOfBeds;
    private final double price;
    private boolean occupied;
    private boolean dirty;

    public Room(int numberOfBeds, double price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = false;
        this.dirty = false;
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
        return !occupied && !dirty;
    }

    public void checkIn() {
        if (isAvailable()) {
            occupied = true;
            dirty = true;
            System.out.println("Checked in ....");
        } else {
            System.out.println("Not available for check in ");
        }
    }

    public void checkOut() {
        if (occupied) {
            occupied = false;
            System.out.println("Checked out ....");
        }else {
            System.out.println("Room is empty");
        }
    }

    public void cleanRoom() {
        if (!occupied && dirty) {
            dirty = false;
            System.out.println("Room is cleaned");
        } else if (occupied){
            System.out.println("Room is not empty to clean");
        } else {
            System.out.println("Room is clean");
        }
    }

}
