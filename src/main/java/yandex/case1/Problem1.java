package yandex.case1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class Problem1 {

    public static void main(String[] args) throws Exception{
        try (
                var reader = new BufferedReader(new InputStreamReader(System.in));
        ) {

            String arg0 = reader.readLine();
            String arg1 = reader.readLine();
            System.out.print(compare(arg0, arg1));
        }
    }

    public static int compare(String arg0, String arg1) {

        Map<Character, Integer> data = new HashMap<>();
        for(Character symbol : arg1.toCharArray()) {
            var count = data.getOrDefault(symbol, 0);
            data.put(symbol, ++count);
        }
        var sum = 0;
        for(Character symbol : arg0.toCharArray()) {
            if(data.containsKey(symbol)) {
                sum += data.get(symbol);
                data.remove(symbol);
            }
        }
        return sum;
    }
}
