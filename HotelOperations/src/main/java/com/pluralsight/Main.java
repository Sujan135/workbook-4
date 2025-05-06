package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(2,140.0);
        System.out.println("Room available: " + room1.isAvailable());
        room1.checkIn();
        System.out.println("Room available: " + room1.isAvailable());
        room1.cleanRoom();
        room1.checkOut();
        room1.cleanRoom();

        Reservation reservation = new Reservation("king", 2, true);
        System.out.println("Reservation Total: $" + reservation.getReservationTotal());

        Employee employee = new Employee(1, "Sujan Banjara", "Front Office", 20.0, 50);

        employee.punchTimeCard(10.0);

        employee.punchTimeCard(12.5);

        employee.punchTimeCard(14.75);

        employee.punchTimeCard(9.0);

        System.out.println("Employee Total Pay: $" + employee.getTotalPay());


    }
}
