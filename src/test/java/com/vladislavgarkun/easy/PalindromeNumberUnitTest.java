package com.vladislavgarkun.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeNumberUnitTest {

    private final PalindromeNumber palindromeNumber = new PalindromeNumber();

    @Test
    public void shouldReturnTrue_whenIsPalindrome_givenPalindromeNumber() {
        // given
        int given = 121;

        // when
        boolean actual = palindromeNumber.isPalindrome(given);

        // then
        Assertions.assertTrue(actual);
    }

    @Test
    public void shouldReturnFalse_whenIsPalindrome_givenNegativeNumber() {
        // given
        int given = -121;

        // when
        boolean actual = palindromeNumber.isPalindrome(given);

        // then
        Assertions.assertFalse(actual);
    }

    @Test
    public void shouldReturnFalse_whenIsPalindrome_givenNonPalindromeNumber() {
        // given
        int given = 10;

        // when
        boolean actual = palindromeNumber.isPalindrome(given);

        // then
        Assertions.assertFalse(actual);
    }

}
