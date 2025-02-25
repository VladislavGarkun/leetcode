package com.vladislavgarkun.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddBinaryUnitTest {

    private final AddBinary addBinary = new AddBinary();

    @Test
    public void shouldReturnBinaryString_whenAddBinary_givenBinaryStrings1() {
        // given
        String a = "1010";
        String b = "1011";
        String expected = "10101";

        // when
        String actual = addBinary.addBinary(a, b);

        // then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnBinaryString_whenAddBinary_givenBinaryStrings2() {
        // given
        String a = "11";
        String b = "1";
        String expected = "100";

        // when
        String actual = addBinary.addBinary(a, b);

        // then
        Assertions.assertEquals(expected, actual);
    }


}
