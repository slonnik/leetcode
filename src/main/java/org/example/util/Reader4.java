package org.example.util;

public class Reader4 {

    public char[] data;
    private int position;

    public int read4(char[] buf4) {

        int counter =0;
        for (int i = position; i < position + Math.min(buf4.length, data.length - position); ++i) {
            buf4[i - position] = data[i];
            counter++;
        }
        position += counter;

        return counter;
    }
}
