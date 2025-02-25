package com.vladislavgarkun.easy;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        String str = s.strip();

        if (str.isEmpty()){
            return 0;
        }

        int j = 1;
        for (int i = str.length() - 1; i > 0; --i) {
            if (str.charAt(i - 1) == ' ') {
                return j;
            }
            j++;
        }

        return j;
    }

}
