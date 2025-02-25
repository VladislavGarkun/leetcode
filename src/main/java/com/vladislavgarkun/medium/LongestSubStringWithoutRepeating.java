package com.vladislavgarkun.medium;

import java.util.HashSet;

public class LongestSubStringWithoutRepeating {

    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int max = 0;

        for (int right = 0; right < s.length(); right++) {
            if (set.contains(s.charAt(right))) {
                while (set.contains(s.charAt(right))) {
                    set.remove(s.charAt(left));
                    left++;
                }
                set.add(s.charAt(right));
            } else {
                set.add(s.charAt(right));
                max = Math.max(max, right - left + 1);
            }
        }

        return max;
    }

}
