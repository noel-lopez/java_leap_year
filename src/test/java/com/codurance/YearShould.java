package com.codurance;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class YearShould {
    @Test
    public void not_be_a_leap_year_given_1997 () {
        assertFalse(Year.isLeap(1997));
    }

    @ParameterizedTest (name = "{0} is a leap year")
    @ValueSource(ints = {1996, 1992, 1988})
    public void be_a_leap_year_if_divisible_by_4 (int year) {
        assertTrue(Year.isLeap(year));
    }

    @ParameterizedTest (name = "{0} is a leap year")
    @ValueSource(ints = {1600, 1200, 800})
    public void be_a_leap_year_if_divisible_by_400 (int year) {
        assertTrue(Year.isLeap(year));
    }

    @Test
    public void not_be_a_leap_year_given_1800 () {
        assertFalse(Year.isLeap(1800));
    }

    @Test
    public void not_be_a_leap_year_given_1900 () {
        assertFalse(Year.isLeap(1900));
    }
}