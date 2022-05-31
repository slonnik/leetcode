package org.example.case7;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class Problem7 {

    public int removeDuplicates(int[] nums) {
        return next(0, 0, nums);
    }

    private int next(int pos, int current, int[] arg0) {
        if (pos == arg0.length) {
            return 0;
        }
        if ((pos == 0) || (arg0[pos - 1] != arg0[pos])) {
            arg0[current] = arg0[pos];
            return 1 + next(++pos, ++current, arg0);
        }

        return next(++pos, current, arg0);
    }
}
