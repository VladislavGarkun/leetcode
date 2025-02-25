package com.vladislavgarkun.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindIndexOfFirstOccurrenceUnitTest {

    private final FindIndexOfFirstOccurrence findIndexOfFirstOccurrence = new FindIndexOfFirstOccurrence();

    @Test
    public void shouldReturnIndexOfFirstOccurrence_whenStrStr_givenTwoStrings1() {
        // given
        String haystack = "mississippi";
        String needle = "issi";
        int expected = 1;

        // when
        int actual = findIndexOfFirstOccurrence.strStr(haystack, needle);

        // then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnIndexOfFirstOccurrence_whenStrStr_givenTwoStrings2() {
        // given
        String haystack = "mississippi";
        String needle = "issip";
        int expected = 4;

        // when
        int actual = findIndexOfFirstOccurrence.strStr(haystack, needle);

        // then
        Assertions.assertEquals(expected, actual);
    }
}
