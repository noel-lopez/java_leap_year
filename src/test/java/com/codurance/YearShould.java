package com.codurance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YearShould {
    @Test
    public void not_be_a_leap_year_given_1997 () {
        assertFalse(Year.isLeap(1997));
    }
}