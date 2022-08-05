package org.example.case34;

/**
 * https://leetcode.com/problems/excel-sheet-column-title/
 */
public class Problem34 {
    public String convertToTitle(int columnNumber) {
        StringBuilder builder = new StringBuilder();
        internal(builder, columnNumber);
        return builder.toString();
    }

    private void internal(StringBuilder builder, int columnNumber) {
        if (columnNumber < 27) {
            builder.append(toChar(columnNumber));
            return;
        }

        int arg0 = columnNumber / 26;
        int arg1 = columnNumber % 26;

        if(arg1 == 0) {
            arg1 = 26;
            arg0 = arg0 - 1;
        }
        internal(builder, arg0);
        internal(builder, arg1);
    }

    private static char toChar(int columnNumber) {
        return (char) ('A' + columnNumber - 1);
    }
}
