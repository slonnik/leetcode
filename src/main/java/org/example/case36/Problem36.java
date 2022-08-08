package org.example.case36;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/problems/two-sum-iii-data-structure-design/
 */
public class Problem36 {

    public static class TwoSum {

        private List<Integer> data;
        private boolean isSorted;

        public TwoSum() {
            data = new ArrayList<>();
        }

        public void add(int number) {
            data.add(number);
            isSorted = false;
        }

        public boolean find(int value) {


            if (data.size() < 2) {
                return false;
            }

            if(!isSorted) {
                Collections.sort(data);
                isSorted = true;
            }

            int startIndex = 0;
            int endIndex = data.size() -1;
            while(startIndex < endIndex) {
                int sum = data.get(startIndex) + data.get(endIndex);
                if(sum == value) {
                    return true;
                }
                if(sum > value) {
                    endIndex--;
                }else {
                    startIndex++;
                }
            }
            return false;
        }
    }
}
