package org.example.case31;

import org.example.util.Reader4;

/**
 * https://leetcode.com/problems/read-n-characters-given-read4/
 */
public class Problem31 extends Reader4 {

    public int read(char[] buf, int n) {
        char[] data = new char[4];
        int consumed = read4(data);
        int position = 0;
        int counter = 0;
        while (consumed != 0) {
            int startPos = position;
            int endPos = Math.min(n, position + consumed);
            for (int i = startPos; i < endPos; ++i) {
                buf[i] = data[i - startPos];
                counter++;
            }
            position += consumed;
            consumed = read4(data);
        }

        return counter;
    }
}
