package com.vladislavgarkun.easy;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        int length = nums.length;

        for (int i = 0; i < length; ++i, ++k) {
            if (nums[i] != val) {
                continue;
            }

            while (length > i && nums[length - 1] == val) {
                --length;
            }

            if (length <= i) {
                return k;
            }

            int temp = nums[length - 1];
            nums[length - 1] = nums[i];
            nums[i] = temp;
        }

        return k;
    }
}
