package com.pluralsight;

public class NameFormatter {
    private NameFormatter() {}


    public static String format(String firstName, String lastname){
        return lastname + ", " + firstName;
    }

    public static String format(String prefix, String lastName, String firstName, String middleName,String suffix) {
        return lastName + ", " + prefix + " " + firstName + " " + middleName + ", " + suffix;
    }

}
