package org.example.case4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem4 {
    public String test(String... strs) {
        // 1. sort by length
        List<String> sorted = new ArrayList<>(List.of(strs));
        Collections.sort(sorted);

        StringBuilder result = new StringBuilder();
        String word = sorted.get(0);
        for (int i = 0; i < word.length(); ++i) {
            char symbol = word.charAt(i);
            for(String item : strs) {
                if(item.charAt(i) != symbol) {
                    return result.toString();
                }
            }
            result.append(symbol);
        }

        return result.toString();
    }
}
