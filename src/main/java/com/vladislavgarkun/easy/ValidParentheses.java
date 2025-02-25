package com.vladislavgarkun.easy;

import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
                continue;
            }

            if (stack.isEmpty()) {
                return false;
            }

            char c2 = stack.pop();
            switch (c2) {
                case '(': if (')' != c) return false; break;
                case '{': if ('}' != c) return false; break;
                case '[': if (']' != c) return false; break;
            }
        }

        return stack.isEmpty();
    }

}

/*public void test()
{
    int k = 0;
    int length = nums.length;

    for (int i = 0; i < length; ++i, ++k)
    {
        if (nums[i] != val)
            continue;

        while (length > i && nums[length - 1] == val)
            --length;

        if (length <= i)
            return k;

        int temp = nums[length - 1];
        nums[length - 1] = nums[i];
        nums[i] = temp;
    }

    return k;
}

public void shit()
{
    int count = 0;
    int k = 0;
    int lenght = nums.length;

    for (int i = 0; i < lenght; ++i)
    {
        if (nums[i] != val)
            continue;

        if (nums[i] == val)
        {
            int temp = nums[lenght - k - 1];
            nums[lenght -k - 1] = nums[i];
            nums[i] = temp;

            if (nums[i] != val)
                ++count;

            //--i;
            ++k;
            //--lenght;
        }
    }

    return count;
}*/