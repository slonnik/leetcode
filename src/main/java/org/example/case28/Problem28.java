package org.example.case28;

/**
 * https://leetcode.com/problems/single-number/
 */
public class Problem28 {
    public int singleNumber(int[] nums) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] < min) {
                min = nums[i];
            }

            if (nums[i] > max) {
                max = nums[i];
            }
        }

        final int size = max - min + 1;

        boolean[] data = new boolean[size];
        for (int i = 0; i < nums.length; ++i) {
            int pos = nums[i] - min;
            data[pos] = !data[pos];
        }
        for (int i = 0; i < size; ++i) {
            if (data[i]) {
                return i + min;
            }
        }
        return -1;
    }
}
