package com.pluralsight;

public class NameFormatter {
    private NameFormatter() {}


    public static String format(String firstName, String lastname){
        return lastname + ", " + firstName;
    }

    public static String format(String prefix, String lastName, String firstName, String middleName,String suffix) {
        return firstName + ", " + prefix + " " + lastName + " " + middleName + ", " + suffix;
    }

    public static String format (String fullName) {
        String[] parts = fullName.split(" ");
        String prefix = parts[0];
        String firstName = parts[1];
        String middleName = parts[2];
        String lastName = parts[3].split(",")[0];
        String suffix = parts[4];

        return lastName + ", " + prefix + " " + firstName + " " + middleName + ", " + suffix;

    }

}
