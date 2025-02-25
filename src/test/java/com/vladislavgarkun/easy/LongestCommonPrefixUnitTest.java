package com.vladislavgarkun.easy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class LongestCommonPrefixUnitTest {

    private final LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    @Test
    public void shouldReturnNonEmptyString_whenLongestCommonPrefix_givenStringWithSamePrefixes() {
        // given
        String[] given = { "flower", "flow", "flight" };
        String expected = "fl";
        // when
        String actual = longestCommonPrefix.longestCommonPrefix(given);

        // then
        Assertions.assertEquals(expected.strip(), actual);
    }

    @Test
    public void shouldReturnEmptyString_whenLongestCommonPrefix_givenStringWithDifferentPrefixes() {
        // given
        String[] given = { "dog", "museum", "car" };
        String expected = "";
        // when
        String actual = longestCommonPrefix.longestCommonPrefix(given);

        // then
        Assertions.assertEquals(expected, actual);
    }
}
