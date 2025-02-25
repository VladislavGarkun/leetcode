package com.vladislavgarkun.medium;

public class ReverseInteger {

    public int reverse(int x) {
        int rev = 0;
        int temp = 0;
        boolean negative = false;

        if (x == Integer.MIN_VALUE) {
            return 0;
        }
        if (x < 0) {
            negative = true;
            x = -x;
        }

        while (x > 9) {
            temp = x % 10;
            x = x / 10;
            rev = rev * 10 + temp;
        }

        if (rev > (Integer.MAX_VALUE - temp) / 10) {
            return 0;
        }
        rev = rev * 10 + x;

        return negative ? -rev : rev;
    }

}
