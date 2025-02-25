package com.vladislavgarkun.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanToIntegerUnitTest {

    private final RomanToInteger romanToInteger = new RomanToInteger();

    @Test
    public void shouldReturnIntegerNumber_whenRomanToInt_givenRomanNumber1() {
        // given
        String given = "III";
        int expected = 3;

        // when
        int actual = romanToInteger.romanToInt(given);

        // then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnIntegerNumber_whenRomanToInt_givenRomanNumber2() {
        // given
        String given = "LVIII";
        int expected = 58;

        // when
        int actual = romanToInteger.romanToInt(given);

        // then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnIntegerNumber_whenRomanToInt_givenRomanNumber3() {
        // given
        String given = "MCMXCIV";
        int expected = 1994;

        // when
        int actual = romanToInteger.romanToInt(given);

        // then
        Assertions.assertEquals(expected, actual);
    }
}
