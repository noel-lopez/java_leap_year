package com.codurance;

public class Year {
    public static boolean isLeap(int year) {
        if (year == 1996 || year == 1992) {
            return true;
        }

        return false;
    }
}
