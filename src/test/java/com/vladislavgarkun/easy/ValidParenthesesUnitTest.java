package com.vladislavgarkun.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidParenthesesUnitTest {

    private final ValidParentheses validParentheses = new ValidParentheses();

    @Test
    public void shouldReturnTrue_whenIsValid_givenValidString1() {
        // given
        String given = "()";

        // when
        boolean actual = validParentheses.isValid(given);

        // then
        Assertions.assertTrue(actual);
    }

    @Test
    public void shouldReturnTrue_whenIsValid_givenValidString2() {
        // given
        String given = "()[]{}";

        // when
        boolean actual = validParentheses.isValid(given);

        // then
        Assertions.assertTrue(actual);
    }

    @Test
    public void shouldReturnTrue_whenIsValid_givenValidString3() {
        // given
        String given = "([])";

        // when
        boolean actual = validParentheses.isValid(given);

        // then
        Assertions.assertTrue(actual);
    }

}
