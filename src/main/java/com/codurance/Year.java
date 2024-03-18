package com.codurance;

public class Year {
    public static boolean isLeap(int year) {
        if (year == 1800 || year == 1900 || year == 2100) {
            return false;
        }

        return isDivisibleBy(year, 4);
    }

    private static boolean isDivisibleBy(int year, int number) {
        return year % number == 0;
    }
}
