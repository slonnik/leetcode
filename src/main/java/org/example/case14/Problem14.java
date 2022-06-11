package org.example.case14;

public class Problem14 {
    public String addBinary(String a, String b) {
       var sb = new StringBuilder();
       internalAdd(a,b,sb, 1, 0);
       return sb.reverse().toString();
    }

    private void internalAdd(String first, String second, StringBuilder sb, int shift, int increment) {
        var currPosOfFirst = first.length() - shift;
        var currPosOfSecond = second.length() - shift;
        if(currPosOfFirst < 0 && currPosOfSecond < 0) {
            if(increment > 0) {
                sb.append(increment);
            }
            return;
        }

        var currValueOfFirst = (currPosOfFirst < 0) ? 0 : valOfChar(first.charAt(currPosOfFirst));
        var currValueOfSecond = (currPosOfSecond < 0) ? 0 : valOfChar(second.charAt(currPosOfSecond));

        var sum = currValueOfFirst + currValueOfSecond + increment;
        sb.append(sum % 2);
        internalAdd(first, second, sb, ++shift, sum / 2);

    }

    private int valOfChar(char symbol) {
        return symbol == '1' ? 1 : 0;
    }
}
