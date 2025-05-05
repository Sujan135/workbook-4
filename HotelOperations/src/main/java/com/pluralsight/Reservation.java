package com.pluralsight;

public class Reservation {
    private final String roomType;
    private final int numberOfNights;
    private final boolean isWeekend;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public double getPrice() {
        double price = 0.00;

        if (roomType!= null) {
            if (roomType.equalsIgnoreCase("king")) {
                price = 139.00;
            } else if (roomType.equalsIgnoreCase("double")) {
                price = 124.00;
            } else {
                System.out.println("Invalid room name:");
            }
        }

        if (isWeekend) {
            price *= 1.10;
        }
        return price;
    }

    public double getReservationTotal() {
        return getPrice() * this.numberOfNights;
    }

}
