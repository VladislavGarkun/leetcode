package com.vladislavgarkun.medium;

public class StringToInteger {

    public int myAtoi(String s) {
        int result = 0;
        int i = 0;
        int temp = 0;
        boolean negative = false;

        s = s.strip();

        if (s.isEmpty()) {
            return 0;
        }

        if (s.charAt(0) == '-') {
            negative = true;
            i = 1;
        } else if (s.charAt(0) == '+') {
            i = 1;
        }

        while (i < s.length() && (s.charAt(i) >= '0' & s.charAt(i) <= '9')) {
            temp = s.charAt(i) - '0';

            if (negative && -result < (Integer.MIN_VALUE + temp) / 10) {
                return Integer.MIN_VALUE;
            }
            if (!negative && result > (Integer.MAX_VALUE - temp) / 10) {
                return Integer.MAX_VALUE;
            }

            result = result * 10 + temp;
            i++;
        }

        return negative ? -result : result;
    }

}
