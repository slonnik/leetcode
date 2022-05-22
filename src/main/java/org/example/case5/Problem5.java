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
        char startSymbol = arg0.charAt(0);
        if (!data.containsKey(startSymbol)) {
            return false;
        }
        char endSymbol = data.get(startSymbol);
        int pos = findSymbol(arg0, endSymbol);
        if (pos < 0) {
            return false;
        }

        var result = isValid(arg0.substring(1, pos));
        if (pos < arg0.length() - 1) {
            result = result && isValid(arg0.substring(pos + 1));
        }

        return result;
    }

    private static int findSymbol(String arg0, char arg1) {
        for (int i = 0; i < arg0.length(); ++i) {
            if (arg0.charAt(i) == arg1) {
                return i;
            }
        }
        return -1;
    }
}
