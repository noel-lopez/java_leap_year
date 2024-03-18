package com.codurance;

public class Year {
    public static boolean isLeap(int year) {
        if (isDivisibleBy(year, 100) && isNotDivisibleBy(year, 400)) {
            return false;
        }

        return isDivisibleBy(year, 4);
    }

    private static boolean isDivisibleBy(int year, int number) {
        return year % number == 0;
    }

    private static boolean isNotDivisibleBy(int year, int number) {
        return !isDivisibleBy(year, number);
    }
}
