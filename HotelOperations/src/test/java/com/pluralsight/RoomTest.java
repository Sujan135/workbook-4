package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void checkIn_SetOccupiedAndDirty() {

        // arrange
        Room room = new Room(2, 100.0);

        // act
        room.checkIn();

        // assert
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
    }

    @Test
    void checkOut_SetOccupiedFalse() {
        // arrange
        Room room = new Room(2, 100.0);

        // act
        room.checkOut();

        // assert
        assertFalse(room.isOccupied());
    }

    @Test
    void cleanRoom_SetDirtyFalseIfRoomUnoccupiedAndDirty() {
        // arrange
        Room room = new Room(2, 100.0);
        room.checkIn();
        room.checkOut();

        // act
        room.cleanRoom();

        // assert
        assertFalse(room.isDirty());
    }

}