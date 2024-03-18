package com.codurance;

public class Year {
    public static boolean isLeap(int year) {
        if (year % 4 == 0) {
            return true;
        }

        return false;
    }
}
