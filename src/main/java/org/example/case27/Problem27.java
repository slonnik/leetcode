package org.example.case27;

/**
 * https://leetcode.com/problems/valid-palindrome/
 */
public class Problem27 {
    public boolean isPalindrome(String s) {

        int length = 0;

        for (int i = 0; i < s.length(); ++i) {
            char symbol = s.charAt(i);
            if (isAlfaNumeric(symbol)) {
                length++;
            }
        }
        if(length == 0) {
            return true;
        }

        int leftPos = 0;
        int rightPos = s.length() - 1;
        for (int i = 0; i < length / 2; ++i) {
            while (!isAlfaNumeric(s.charAt(rightPos))) {
                rightPos--;
            }
            while (!isAlfaNumeric(s.charAt(leftPos))) {
                leftPos++;
            }
            if (toLower(s.charAt(rightPos)) != toLower(s.charAt(leftPos))) {
                return false;
            }
            leftPos++;
            rightPos--;
        }

        return true;
    }

    private static boolean isAlfaNumeric(char symbol) {
        return (symbol >= 'A' && symbol <= 'Z') || (symbol >= 'a' && symbol <= 'z')
                || (symbol >= '0' && symbol <= '9');
    }

    private static char toLower(char symbol) {

        if (symbol >= 'a') {
            return symbol;
        }

        return (char) ('a' + (symbol - 'A'));
    }
}
