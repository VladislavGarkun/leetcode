package com.vladislavgarkun.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesUnitTest {

    private final RemoveDuplicates removeDuplicates = new RemoveDuplicates();

    @Test
    public void shouldReturnArrayLength_whenRemoveElement_givenArrayAndValue() {
        // given
        int[] given = { 0,0,1,1,1,2,2,3,3,4 };

        // when
        int actual = removeDuplicates.removeDuplicates(given);

        Assertions.assertEquals(actual, 5);
    }

}
