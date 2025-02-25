package com.vladislavgarkun.easy;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        int min = Integer.MAX_VALUE;
        for(String str:strs) {
            min = Math.min(min,str.length());
        }

        for(int i = 0; i < min; i++) {
            boolean flag = false;
            char compare = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++) {
                if(strs[j].charAt(i) != compare) {
                    flag = true;
                    break;
                }
            }
            if(flag) {
                return strs[0].substring(0, i);
            }
        }

        return strs[0].substring(0, min);
    }

}
