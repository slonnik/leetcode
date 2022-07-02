package org.example.case28;

/**
 * https://leetcode.com/problems/single-number/
 */
public class Problem28 {
    public int singleNumber(int[] nums) {
        final int shift = 3 * 10_000;
        final int size = 6 * 10_1000 + 1;
        boolean[] data = new boolean[size];
        for (int i = 0; i < nums.length; ++i) {
            int pos = nums[i] + shift;
            if (data[pos] == true) {
                data[pos] = false;
            } else {
                data[pos] = true;
            }
        }
        for (int i = 0; i < size; ++i) {
            if (data[i]) {
                return i - shift;
            }
        }
        return -1;
    }
}
