package org.example.case3;

import java.util.HashMap;
import java.util.Map;

public class Problem3 {

    private static Map<Character, Integer> data = new HashMap<>();

    static{
        data.put('I', 1);
        data.put('V', 5);
        data.put('X', 10);
        data.put('L', 50);
        data.put('C', 100);
        data.put('D', 500);
        data.put('M', 1000);
    }

    public static int test(String arg) {

        final int size= arg.length();
        int[] result = new int[size];


        for(int i =0; i < arg.length(); ++i) {
            result[i] = data.get(arg.charAt(i));
            if(i > 0 && result[i-1] < result[i]) {
                result[i-1] = -result[i-1];
            }

        }

        int sum = 0;

        for(int i =0 ; i < result.length; ++i) {
            sum += result[i];
        }

        return sum;
    }
}
