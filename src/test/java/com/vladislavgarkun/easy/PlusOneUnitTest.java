package com.vladislavgarkun.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlusOneUnitTest {

    private final PlusOne plusOne = new PlusOne();

    @Test
    public void shouldReturnIntArray_whenPlusOne_givenNumberArray() {
        // given
        int[] givenNumbers = { 8, 9, 9, 9 };
        int[] expected = { 9, 0, 0, 0 };

        // when
        int[] actual = plusOne.plusOne(givenNumbers);

        // then
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnExtendedIntArray_whenPlusOne_givenNumberArray() {
        // given
        int[] givenNumbers = { 9, 9, 9, 9 };
        int[] expected = { 1, 0, 0, 0, 0 };

        // when
        int[] actual = plusOne.plusOne(givenNumbers);

        // then
        Assertions.assertArrayEquals(expected, actual);
    }

}
