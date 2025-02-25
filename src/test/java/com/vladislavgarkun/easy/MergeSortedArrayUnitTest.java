package com.vladislavgarkun.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeSortedArrayUnitTest {

    private final MergeSortedArray mergeSortedArray = new MergeSortedArray();

    @Test
    public void shouldMergeArrays_whenMerge_givenNumberArrays() {
        // given
        int[] array1 = { 1,2, 3, 0, 0, 0 };
        int[] array2 = { 2, 5, 6 };
        int[] expected = { 1, 2, 2, 3, 5, 6 };

        // when
        mergeSortedArray.merge(array1, 3, array2, 3);

        // then
        Assertions.assertArrayEquals(expected, array1);
    }
}
