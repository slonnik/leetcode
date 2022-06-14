package yandex.case2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem2 {

    public static void main(String[] args) throws Exception {
        try (
                var reader = new BufferedReader(new InputStreamReader(System.in));
        ) {

            String arg0 = reader.readLine();
            var count = Integer.valueOf(arg0);
            if(count == 0){
                System.out.print(0);
                return;
            }
            var data = new int[count];
            for (int i = 0; i < count; ++i) {
                data[i] = Integer.valueOf(reader.readLine());
            }
            if(count == 1) {
                System.out.print(data[0]);
                return;
            }
            long max = 0;
            long cur = data[0];
            for(int i = 1; i < count; ++i) {
                if(cur + data[i] == cur) {
                    if(cur > max) {
                        max = cur;
                    }
                    cur = 0;
                } else {
                    cur += data[i];
                }
            }
            System.out.print(Math.max(cur, max));
        }
    }
}
