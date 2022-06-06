package org.example.case10;

/**
 * https://leetcode.com/problems/search-insert-position/
 */
public class Problem10 {

    public int searchInsert(int[] nums, int target) {
        return internal(nums, 0, nums.length - 1, target);
    }

    private int internal(int[] nums, int startPos, int endPos, int target) {

        if(startPos == endPos) {
            if(target > nums[startPos]) {
                return ++startPos;
            }
            return startPos;
        }

        int middlePos = startPos + (endPos - startPos)/2;
        int middleValue = nums[middlePos];
        if(target > middleValue) {
            return internal(nums, ++middlePos, endPos, target);
        }
        else{
            return internal(nums, startPos, middlePos, target);
        }
    }
}
