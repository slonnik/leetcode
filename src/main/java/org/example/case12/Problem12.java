package org.example.case12;

public class Problem12 {

    public int lengthOfLastWord(String s) {
        char[] data = s.toCharArray();
        var length = 0;
        for (int i = data.length - 1; i > -1; --i) {
            if (' ' != data[i]) {
                length++;
            } else {
                if (length != 0) {
                    break;
                }
            }
        }
        return length;
    }
}