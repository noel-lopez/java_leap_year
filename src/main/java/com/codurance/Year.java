package com.codurance;

public class Year {
    public static boolean isLeap(int year) {
        if (year % 100 == 0 && year % 400 != 0) {
            return false;
        }

        return isDivisibleBy(year, 4);
    }

    private static boolean isDivisibleBy(int year, int number) {
        return year % number == 0;
    }
}
