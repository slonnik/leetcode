package org.example.case42;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.abs;

/**
 * https://leetcode.com/problems/contains-duplicate-ii/
 */
public class Problem42 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> data = new HashMap<>();
        for(int i =0 ; i < nums.length; ++i) {
            var key = nums[i];
            if(!data.containsKey(key)) {
                data.put(key, i);
            } else {
                var position = data.get(key);
                if(Math.abs(position - i) <= k) {
                    return true;
                }
                data.put(key, i);
            }
        }
        return false;
    }
}
