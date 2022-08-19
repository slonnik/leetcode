package org.example.case41;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/contains-duplicate/
 */
public class Problem41 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int iterateValue = nums[0];
        for (int i = 0; i < nums.length; ++i) {
            if (iterateValue == nums[i]) {
                count++;
            } else {
                iterateValue = nums[i];
                count = 1;
            }
            if (count > 1) {
                return true;
            }
        }
        return false;
    }
}
