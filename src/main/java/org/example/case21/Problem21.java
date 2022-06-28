package org.example.case21;

import org.example.util.TreeNode;

public class Problem21 {

    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0) {
            return new TreeNode();
        }
        if(nums.length == 1) {
            return new TreeNode(nums[0]);
        }
        return internalSorted(nums, 0, nums.length - 1);

    }

    private TreeNode internalSorted(int[] nums, int start, int end) {
        if (end - start == 0) {
            return new TreeNode(nums[start]);
        }
        if(end - start == 1) {
            return new TreeNode(nums[end], new TreeNode(nums[start]), null );
        }

        var rootIndex = (end + start) / 2;
        return new TreeNode(nums[rootIndex], internalSorted(nums, start, rootIndex - 1), internalSorted(nums, rootIndex + 1, end));

    }
}
