package com.pluralsight;

public class NameFormatter {
    private NameFormatter() {}


    public static String format(String firstName, String lastname){
        return lastname + "," + firstName;

    }
}
