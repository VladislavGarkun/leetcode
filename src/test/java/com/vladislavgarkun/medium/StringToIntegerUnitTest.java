package com.vladislavgarkun.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringToIntegerUnitTest {

    private final StringToInteger stringToInteger = new StringToInteger();

    @Test
    public void shouldReturnInteger_whenMyAtoi_givenStringWithInteger() {
        // given
        String s = "-2147483648";
        int expected = -2147483648;

        // when
        int actual = stringToInteger.myAtoi(s);

        // then
        Assertions.assertEquals(expected, actual);
    }
}
