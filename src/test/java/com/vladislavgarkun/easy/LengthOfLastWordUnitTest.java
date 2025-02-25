package com.vladislavgarkun.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LengthOfLastWordUnitTest {

    private final LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();

    @Test
    public void shouldReturnFive_whenLengthOfLastWord_givenString() {
        // given
        String given = "Hello World";
        int expected = 5;

        // when
        int actual = lengthOfLastWord.lengthOfLastWord(given);

        // then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFour_whenLengthOfLastWord_givenString() {
        // given
        String given = "   fly me   to   the moon  ";
        int expected = 4;

        // when
        int actual = lengthOfLastWord.lengthOfLastWord(given);

        // then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnSix_whenLengthOfLastWord_givenString() {
        // given
        String given = "luffy is still joyboy";
        int expected = 6;

        // when
        int actual = lengthOfLastWord.lengthOfLastWord(given);

        // then
        Assertions.assertEquals(expected, actual);
    }

}
