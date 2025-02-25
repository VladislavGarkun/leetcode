package com.vladislavgarkun.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestPalindromicSubstringUnitTest {

    private final LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();

    @Test
    public void shouldReturnSubstring_whenLongestPalindrome_givenString1() {
        // given
        String given = "babad";
        String expected = "bab";

        // when
        String actual = longestPalindromicSubstring.longestPalindrome(given);

        // then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnSubstring_whenLongestPalindrome_givenString2() {
        // given
        String given = "cbbd";
        String expected = "bb";

        // when
        String actual = longestPalindromicSubstring.longestPalindrome(given);

        // then
        Assertions.assertEquals(expected, actual);
    }

}
