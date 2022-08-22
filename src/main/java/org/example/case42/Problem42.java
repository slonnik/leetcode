package org.example.case42;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import static java.lang.Math.abs;

/**
 * https://leetcode.com/problems/contains-duplicate-ii/
 */
public class Problem42 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Deque<Integer>> data = new HashMap<>();
        for(int i =0 ; i < nums.length; ++i) {
            var key = nums[i];
            if(!data.containsKey(key)) {
                Deque<Integer> deque = new LinkedList<>();
                deque.add(i);
                data.put(key, deque);
            } else {
                var deque = data.get(key);
                if(abs(deque.peekLast() - i) <= k) {
                    return true;
                }
                deque.add(i);
            }
        }
        return false;
    }
}
