package org.example.case11;

public class Problem11 {

    public int maxSubArray(int[] nums) {
        var sum = nums[0];
        var cur = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            cur = Math.max(nums[i], cur + nums[i]);
            sum = Math.max(cur, sum);
        }
        return sum;
    }
}
