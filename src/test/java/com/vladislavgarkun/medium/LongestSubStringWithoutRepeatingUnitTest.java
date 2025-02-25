package com.vladislavgarkun.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestSubStringWithoutRepeatingUnitTest {

    private final LongestSubStringWithoutRepeating longestSubStringWithoutRepeating = new LongestSubStringWithoutRepeating();

    @Test
    public void shouldReturnThree_whenLengthOfLongestSubstring_givenString1() {
        // given
        String given = "abcabcbb";
        int expected = 3;

        // when
        int actual = longestSubStringWithoutRepeating.lengthOfLongestSubstring(given);

        // then
        Assertions.assertEquals(expected, actual);
    }

}
