package com.codurance;

public class Year {
    public static boolean isLeap(int year) {
        if (isDivisibleBy(year, 100) && !isDivisibleBy(year, 400)) {
            return false;
        }

        return isDivisibleBy(year, 4);
    }

    private static boolean isDivisibleBy(int year, int number) {
        return year % number == 0;
    }
}
