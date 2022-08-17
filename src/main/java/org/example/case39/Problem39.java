package org.example.case39;


import java.util.*;

public class Problem39 {

    private static class Pair {
        private final Character value1;
        private final Character value2;
        private Pair(Character value1, Character value2) {
            this.value1 = value1;
            this.value2 = value2;
        }
    }
    public boolean isIsomorphic(String s, String t) {

        return isIsomorphicInternal(s, t) && isIsomorphicInternal(t, s);
    }

    private boolean isIsomorphicInternal(String s, String t) {
        List<Pair> entries = new LinkedList<>();
        for(int i=0; i < s.length(); ++i) {
            entries.add(new Pair(s.charAt(i), t.charAt(i)));
        }

        Collections.sort(entries, (entry1, entry2) -> {
            return entry1.value1 - entry2.value1;
        });

        var startEntry = entries.get(0);
        for(Pair entry : entries) {
            if(startEntry.value1 == entry.value1) {
                if(startEntry.value2 != entry.value2) {
                    return false;
                }
            }else {
                startEntry = entry;
            }
        }
        return true;
    }
}
