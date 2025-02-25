package com.vladislavgarkun.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchInsertPositionUnitTest {

    private final SearchInsertPosition searchInsertPosition = new SearchInsertPosition();

    @Test
    public void shouldReturnIndexTwo_whenSearchInsert_givenNumberArray() {
        // given
        int[] givenNumbers = { 1,3,5,6 };
        int givenTarget = 5;
        int expected = 2;

        // when
        int actual = searchInsertPosition.searchInsert(givenNumbers, givenTarget);

        // then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnIndexOne_whenSearchInsert_givenNumberArray() {
        // given
        int[] givenNumbers = { 1,3,5,6 };
        int givenTarget = 2;
        int expected = 1;

        // when
        int actual = searchInsertPosition.searchInsert(givenNumbers, givenTarget);

        // then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnIndexFour_whenSearchInsert_givenNumberArray() {
        // given
        int[] givenNumbers = { 1,3,5,6 };
        int givenTarget = 7;
        int expected = 4;

        // when
        int actual = searchInsertPosition.searchInsert(givenNumbers, givenTarget);

        // then
        Assertions.assertEquals(expected, actual);
    }

}
