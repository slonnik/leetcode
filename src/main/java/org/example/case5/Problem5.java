package org.example.case5;

import java.util.HashMap;
import java.util.Map;

public class Problem5 {

    private final static Map<Character, Character> data = new HashMap<>();

    static {
        data.put('{', '}');
        data.put('[', ']');
        data.put('(', ')');
    }

    public boolean isValid(String arg0) {
        if (arg0.length() == 0) {
            return true;
        }

        if (arg0.contains("{}")) {
            return isValid(arg0.replaceAll("\\{\\}", ""));
        } else if (arg0.contains("()")) {
            return isValid(arg0.replaceAll("\\(\\)", ""));
        } else if (arg0.contains("[]")) {
            return isValid(arg0.replaceAll("\\[\\]", ""));
        }
        return false;

    }

    public boolean isValid2(String arg0) {
        return internalValid(0, arg0.length() - 1, arg0);
    }

    private boolean internalValid(int start, int end, String arg0) {
        if (end - start < 1) {
            return false;
        }

        char startSymbol = arg0.charAt(start);
        if (!data.containsKey(startSymbol)) {
            return false;
        }

        char endSymbol = data.get(startSymbol);
        if (arg0.charAt(end) == endSymbol) {
            if (end - start == 1) {
                return true;
            }
            return internalValid(start + 1, end - 1, arg0);
        }

        if (end - start == 1) {
            return false;
        }

        int i = end - 1;
        while (i > start) {
            if (arg0.charAt(i) == endSymbol) {
                break;
            }
            i--;
        }
        if (i == start) {
            return false;
        }
        return internalValid(start, i, arg0) && internalValid(i + 1, end, arg0);
    }
}
