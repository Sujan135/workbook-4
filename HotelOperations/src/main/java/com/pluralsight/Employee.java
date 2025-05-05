package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private final double payRate;
    private final double hoursWorked;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getRegularHours() {
        if (getHoursWorked() <= 40) {
            return getHoursWorked();
        } else {
            return 40;
        }
    }

    public double getOvertimeHours() {
        if (getHoursWorked() > 40) {
            return getRegularHours() - 40;
        } else {
            return 0;
        }
    }

    public double getTotalPay() {
        double regularPay = getRegularHours() * payRate;
        double overtimePay = getOvertimeHours() * payRate * 1.5;
        double totalPay = regularPay + overtimePay;
        return totalPay;
    }
}
