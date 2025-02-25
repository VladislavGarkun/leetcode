package com.vladislavgarkun.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int secondValue = target - nums[i];

            if (map.containsKey(secondValue)) {
                return new int[]{map.get(secondValue), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }

}
