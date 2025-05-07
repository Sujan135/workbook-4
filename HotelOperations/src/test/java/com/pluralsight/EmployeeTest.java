package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void punchIn_SetCorrectTime() {

        // arrange
        Employee employee = new Employee(1, "Sujan Banjara", "Front Office", 20.0, 80);
        double punchInTime = 9.0;

        // act
        employee.punchTimeCard(punchInTime);

        // assert
        assertEquals(punchInTime, employee.getPunchInTime());
    }

    @Test
    void punchOut_CalculateTotalHours() {

        // arrange
        Employee employee = new Employee(1, "Sujan Banjara", "Front Office", 20.0, 0);
        employee.punchTimeCard(9.0);

        // act
        employee.punchTimeCard(17.0);

        // assert

        double expectedTotalHours = 8.0;

        double actual = employee.getHoursWorked();
        assertEquals(expectedTotalHours, actual);

    }
}