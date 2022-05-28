package tinkoff.test1;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Есть скобочное выражение с разными видами скобок {}, (), [], <>.
 * Проверить, что оно правильное. Других символов, кроме скобок, быть не может.
 *
 * Input: ([{}])
 * Output: true
 */

public class Problem1 {

    private static Map<Character, Character> data = new HashMap<>();

    static {
        data.put('}', '{');
        data.put(')', '(');
        data.put(']', '[');
    }

    public boolean validate(String arg0) {
        Deque<Character> deque = new LinkedList<>();
        internalCaheck(deque, 0, arg0);
        return deque.isEmpty();
    }

    private static void internalCaheck(Deque<Character> deque, int position, String arg0) {
        if(position >= arg0.length())
        {
            return;
        }

        char symbol = arg0.charAt(position);

        if(deque.isEmpty()) {
            deque.addLast(symbol);
        }else {
            char queueSymbol = deque.peekLast();
            if(!data.containsKey(symbol)) {
                deque.addLast(symbol);
            }else {
                if(data.get(symbol) == queueSymbol) {
                    deque.removeLast();
                }else {
                    deque.addLast(symbol);
                }
            }

        }
        internalCaheck(deque, ++position, arg0);
    }
}
