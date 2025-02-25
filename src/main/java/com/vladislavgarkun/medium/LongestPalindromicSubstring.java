package com.vladislavgarkun.medium;

public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        int left = 0, right = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (j - i > max && isPalindrome(s, i, j)) {
                    max = j - i;
                    left = i;
                    right = j;
                }
            }
        }

        return s.substring(left, right + 1);
    }

    private boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }

        return true;
    }

}
