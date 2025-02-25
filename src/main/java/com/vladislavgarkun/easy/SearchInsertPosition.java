package com.vladislavgarkun.easy;

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int i = 0;

        if (target > nums[nums.length - 1]) {
            return nums.length;
        }

        while (target > nums[i]) {
            i++;
        }

        return i;
    }

}
