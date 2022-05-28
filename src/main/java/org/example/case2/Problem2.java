package org.example.case2;

import java.util.LinkedList;

/**
 * https://leetcode.com/problems/palindrome-number/
 */
public class Problem2 {

    public static boolean test(int arg) {

        var builder = new StringBuilder().append(arg);

        return builder.toString().equalsIgnoreCase(builder.reverse().toString());
    }

    public static boolean test2(int x) {

        long arg = (long)x;

        if (arg < 0) {
            return false;
        }

        long sum = 0;
        while (arg > 0) {
            sum = sum * 10 + arg %10;
            arg /= 10;
        }
        return sum == x;
    }
}
