package org.example.case15;

/**
 * https://leetcode.com/problems/sqrtx/
 */
public class Problem15 {

    public int mySqrt(int arg0) {
        long rightEnd = 1L;
        while (rightEnd * rightEnd < arg0) {
            rightEnd *= 2;
        }
        long leftEnd = rightEnd / 2;
        return internalSqrt(leftEnd, rightEnd, arg0);
    }

    private int internalSqrt(long leftEnd, long rightEnd, int arg0) {

        if (rightEnd - leftEnd < 2) {
            if(rightEnd * rightEnd == arg0) {
                return (int)rightEnd;
            }

            return (int)leftEnd;
        }
        long middle = (leftEnd + rightEnd) / 2;
        if(middle*middle < arg0) {
            return internalSqrt(middle, rightEnd, arg0);
        }else {
            return internalSqrt(leftEnd, middle, arg0);
        }
    }
}
