package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    private double punchInTime;
    private boolean punchedIn;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.punchedIn =false;
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
        return regularPay + overtimePay;
    }

    public void punchIn(double time) {
        if (!punchedIn) {
            punchInTime =time;
            punchedIn = true;
            System.out.println(name + "punched in at " + time);
        } else {
            System.out.println(name + " is already punched in.");
        }
    }

    public void punchOut(double time){
        if (punchedIn) {
            double workedTime = time -punchInTime;
            if (workedTime < 0) {
                System.out.println("Invalid punch out time");
                return;
            }
            hoursWorked += workedTime;
            punchedIn =false;
            System.out.println(name + " punched out at " + time + " worked " + workedTime + "hours.");
        } else {
            System.out.println(name + "must punch in ...");
        }
    }

}
