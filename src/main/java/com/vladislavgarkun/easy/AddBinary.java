package com.vladislavgarkun.easy;

public class AddBinary {

    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();

        int i = a.length();
        int j = b.length();
        int transfer = 0;
        int aval = 0, bval = 0;
        do {
            if (i > 0) {
                i--;
                aval = a.charAt(i) - '0';
            } else {
                aval = 0;
            }

            if (j > 0) {
                j--;
                bval = b.charAt(j) - '0';
            } else {
                bval = 0;
            }

            int sum = aval + bval + transfer;
            switch (sum){
                case 0: result.insert(0, 0); transfer = 0; break;
                case 1: result.insert(0, 1); transfer = 0; break;
                case 2: result.insert(0, 0); transfer = 1; break;
                case 3: result.insert(0, 1); transfer = 1; break;
            }
        } while (i > 0 || j > 0);

        if (transfer == 1) {
            result.insert(0, 1);
        }

        return result.toString();
    }

}
