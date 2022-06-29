package org.example.case25;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem25Test {

    @Test
    void testPositive1() {
        var expected = List.of(
                List.of(1),
                List.of(1,1),
                List.of(1,2,1),
                List.of(1,3, 3, 1),
                List.of(1, 4, 6,  4, 1)
        );
        assertEquals(expected, new Problem25().generate(5));
    }
}
