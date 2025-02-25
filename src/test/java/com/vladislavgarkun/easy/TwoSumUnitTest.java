package com.vladislavgarkun.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumUnitTest {

    private final TwoSum twoSum = new TwoSum();

    @Test
    public void shouldReturnIntArray_whenTwoSum_givenNumberArray1() {
        // given
        int[] givenNumbers = { 2, 7, 11, 15 };
        int givenTarget = 9;
        int[] expected = { 0, 1 };

        // when
        int[] actual = twoSum.twoSum(givenNumbers, givenTarget);

        // then
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnIntArray_whenTwoSum_givenNumberArray2() {
        // given
        int[] givenNumbers = { 3, 2, 4 };
        int givenTarget = 6;
        int[] expected = { 1, 2 };

        // when
        int[] actual = twoSum.twoSum(givenNumbers, givenTarget);

        // then
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnIntArray_whenTwoSum_givenNumberArray3() {
        // given
        int[] givenNumbers = { 3, 3 };
        int givenTarget = 6;
        int[] expected = { 0, 1 };

        // when
        int[] actual = twoSum.twoSum(givenNumbers, givenTarget);

        // then
        Assertions.assertArrayEquals(expected, actual);
    }

}
