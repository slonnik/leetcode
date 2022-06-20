package org.example.case17;

/**
 * https://leetcode.com/problems/merge-sorted-array/
 */
public class Problem17 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        var total = m + n;
        var currPos = total;
        for (int i = 0; i < total; ++i) {
            var val1 = (m > 0) ? nums1[m - 1] : Integer.MIN_VALUE;
            var val2 = (n > 0) ? nums2[n - 1] : Integer.MIN_VALUE;
            if (val2 > val1) {
                n--;
                nums1[--currPos] = val2;
            } else {
                m--;
                nums1[--currPos] = val1;
            }
        }
    }
}
