package org.example.case5;

import java.util.*;

/**
 * https://leetcode.com/problems/valid-parentheses/
 */
public class Problem5 {

    private final static Map<Character, Character> data = new HashMap<>();

    static {
        data.put('}', '{');
        data.put(']', '[');
        data.put(')', '(');
    }

    public boolean isValid(String arg0) {

        Deque<Character> queue = new LinkedList<>();

        internalTest(queue, 0, arg0);

        return queue.isEmpty();
    }

    private void internalTest(Deque<Character> queue, int position, String arg0) {
        if(position >= arg0.length()) {
            return;
        }

        char symbol = arg0.charAt(position);

        if(queue.isEmpty()) {
            queue.addLast(symbol);
        }
        else {
            if(!data.containsKey(symbol)) {
                queue.addLast(symbol);
            }else {
                char queueSymbol = queue.peekLast();
                if(data.get(symbol) == queueSymbol) {
                    queue.removeLast();
                }else{
                    queue.addLast(symbol);
                }
            }
        }
        internalTest(queue, ++position, arg0);
    }


}
