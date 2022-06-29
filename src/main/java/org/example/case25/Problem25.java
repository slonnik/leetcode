package org.example.case25;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/pascals-triangle/
 */
public class Problem25 {

    public List<List<Integer>> generate(int numRows) {
        if(numRows == 0) {
            return List.of();
        }
        LinkedList<List<Integer>> result = new LinkedList<>();
        result.add(List.of(1));
        for (int i = 1; i < numRows; ++i) {
            result.add(reduce(result.peekLast()));
        }
        return result;
    }

    private LinkedList<Integer> reduce(List<Integer> arg0) {
        if (arg0.size() == 1) {
            return new LinkedList<>(List.of(1, 1));
        }
        LinkedList<Integer> result = new LinkedList<>();
        Iterator<Integer> iterator = arg0.iterator();
        int startValue = iterator.next();
        while (iterator.hasNext()) {
            int curValue = iterator.next();
            result.add(startValue + curValue);
            startValue = curValue;
        }
        result.addFirst(1);
        result.addLast(1);
        return result;
    }
}
