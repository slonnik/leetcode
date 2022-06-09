package org.example.case13;
public class Problem13 {

    public int[] plusOne(int[] digits) {
        var pos = digits.length;
        while(internalSum(digits, --pos, 1) > 0) {
            if(pos == 0) {
                int[] result = new int[digits.length + 1];
                result[0] = 1;
                for(int i = 0; i < digits.length; ++i) {
                    result[i+1] = digits[i];
                }
                return result;
            }
        }
        return digits;
    }

    private int internalSum(int[] digits, int pos, int increment) {
        var value = digits[pos] + increment;
        if(value < 10) {
            digits[pos] = value;
            return 0;
        }
        digits[pos] = value -10;
        return 1;
    }
}
