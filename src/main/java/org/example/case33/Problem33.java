package org.example.case33;

import java.util.List;

/**
 * https://leetcode.com/problems/missing-ranges/
 */
public class Problem33 {

    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        //int notInLength = nums[nums.length - 1] - nums[0];
        //int[] notInData = new int[notInLength];
        //int minValue = Math.min(nums[0], lower);
        //int maxValue = Math.max(nums[nums.length - 1], upper);
        int index = 0;
        int count = 0;
        for (int i = lower; i <= upper; ++i) {
            if (index >= nums.length) {
                System.out.println(i);
                continue;
            }
            int value = nums[index];
            if (i < value) {
                count++;
                System.out.println(i);
            } else if (i == value) {
                int end = value - 1;
                int start = value - count;
                count = 0;
                index++;
                System.out.println(String.format("%d->%d", start, end));
            }
        }
        return List.of();
    }


}
