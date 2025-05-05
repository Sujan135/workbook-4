package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(2,140.0, false,false);
        System.out.println("Room available: " + room1.isAvailable());

        Reservation reservation = new Reservation("king", 2, true);
        System.out.println("Reservation Total: $" + reservation.getReservationTotal());

        Employee employee = new Employee(1, "Sujan Banjara", "Front Office", 20.0, 50);
        System.out.println("Employee Total Pay: $" + employee.getTotalPay());


    }
}
