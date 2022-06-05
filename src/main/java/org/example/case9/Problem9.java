package org.example.case9;

/**
 * https://leetcode.com/problems/implement-strstr/
 */
public class Problem9 {
    public int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) {
            return -1;
        }
        if (needle.length() == 0) {
            return -1;
        }

        return internal(haystack.toCharArray(), needle.toCharArray(), 0);
    }

    private int internal(char[] haystack, char[] needle, int startPos) {

        if((haystack.length - startPos) < needle.length) {
            return -1;
        }
        if(contains(haystack, needle, startPos)) {
            return startPos;
        }
        return internal(haystack, needle, ++startPos);
    }

    private boolean contains(char[] haystack, char[] needle, int startPos) {
        for(int i = 0; i < needle.length; ++i) {
            if(haystack[startPos +i] != needle[i]) {
                return false;
            }
        }
        return true;
    }

}
