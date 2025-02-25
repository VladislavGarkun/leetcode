package com.vladislavgarkun.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveElementUnitTest {

    private final RemoveElement removeElement = new RemoveElement();

    @Test
    public void shouldReturnArrayLength_whenRemoveElement_givenArrayAndValue() {
        // given
        int[] given = { 0,1,2,2,3,0,4,2 };

        // when
        int actual = removeElement.removeElement(given, 2);

        Assertions.assertEquals(actual, 5);
    }

}
