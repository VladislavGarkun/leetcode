package com.vladislavgarkun.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseIntegerUnitTest {

    private final ReverseInteger reverseInteger = new ReverseInteger();

    @Test
    public void shouldReturnZero_whenReverse_givenInteger() {
        // given
        int x = -2147483648;
        int expected = 0;

        // when
        int actual = reverseInteger.reverse(x);

        // then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnReversedInteger_whenReverse_givenInteger() {
        // given
        int x = -123;
        int expected = -321;

        // when
        int actual = reverseInteger.reverse(x);

        // then
        Assertions.assertEquals(expected, actual);
    }

}
