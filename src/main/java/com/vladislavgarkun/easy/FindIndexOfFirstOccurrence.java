package com.vladislavgarkun.easy;

public class FindIndexOfFirstOccurrence {

    public int strStr(String haystack, String needle) {
        int j = 0;
        int k = 0;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                if (j == 0) {
                    k = i;
                }
                if (j == needle.length() - 1) {
                    return k;
                } else {
                    j++;
                }
            } else {
                if (i > 0 && j > 0 && haystack.charAt(i - 1) == needle.charAt(j - 1)) {
                    i = k;
                }
                j = 0;
            }
        }

        return -1;
    }

}
