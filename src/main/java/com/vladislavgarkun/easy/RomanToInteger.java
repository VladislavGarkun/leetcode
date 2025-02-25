package com.vladislavgarkun.easy;

public class RomanToInteger {

    public int romanToInt(String s) {
        int result = 0, current = 0;
        for(int i = s.length() - 1; i >= 0 ; i--){
            switch (s.charAt(i)) {
                case 'M' -> current = 1000;
                case 'D' -> current = 500;
                case 'C' -> current = 100;
                case 'L' -> current = 50;
                case 'X' -> current = 10;
                case 'V' -> current = 5;
                case 'I' -> current = 1;
            }

            if (4 * current < result){
                result -= current;
            } else {
                result += current;
            }
        }

        return result;
    }

}
