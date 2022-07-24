package org.example.case33;

import java.util.*;

/**
 * https://leetcode.com/problems/missing-ranges/
 */
public class Problem33 {

    public List<String> findMissingRanges(int[] nums, int lower, int upper) {

        var result = new LinkedHashMap<Integer, Deque<Integer>>();
        int index = 0;
        for (int i = lower; i <= upper; ++i) {
            int value = (index < nums.length) ? nums[index] : upper + 1;
            if (i < value) {
                var deque = result.getOrDefault(value, new LinkedList<>());
                deque.add(i);
                result.put(value, deque);
            } else if (i == value) {
                index++;
            }
        }

        List<String> resultList = new LinkedList<>();
        for (Map.Entry<Integer, Deque<Integer>> entry : result.entrySet()) {
            var deque = entry.getValue();
            if (deque.size() == 1) {
                resultList.add(String.format("%d", deque.element()));
            } else {
                resultList.add(String.format("%d->%d", deque.getFirst(), deque.getLast()));
            }
        }
        return resultList;
    }


}
