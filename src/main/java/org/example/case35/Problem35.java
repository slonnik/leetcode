package org.example.case35;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/majority-element/
 */
public class Problem35 {
    public int majorityElement(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }
        int threshold = nums.length / 2;
        Arrays.sort(nums);
        int current = nums[0];
        int count = 1;
        for(int i = 1; i < nums.length; ++i) {
            if(current == nums[i]) {
                count++;

            } else {
                count = 1;
            }
            if(count > threshold) {
                return current;
            }
            current = nums[i];
        }
        return 0;
    }
}
