package org.example.case8;

/**
 * https://leetcode.com/problems/remove-element/
 */
public class Problem8 {
    public int removeElement(int[] nums, int val) {
        return test(nums, val, 0, 0);
    }

    private int test(int[] nums, int val, int currentPos, int lastPos) {
        if (currentPos >= nums.length) {
            return lastPos;
        }

        if (nums[currentPos] != val) {
            nums[lastPos] = nums[currentPos];
            lastPos ++;
        }

        return test(nums, val, ++currentPos, lastPos);
    }
}
