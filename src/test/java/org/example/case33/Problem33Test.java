package org.example.case33;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem33Test {

    @Test
    void testPositive1() {
        int[] data = new int[]{0, 1, 3, 50, 75};
        assertEquals(List.of("2","4->49","51->74","76->99"), new Problem33().findMissingRanges(data, 0, 99));
    }
}
