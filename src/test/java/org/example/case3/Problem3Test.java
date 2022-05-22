package org.example.case3;

import org.example.case2.Problem2;
import org.junit.jupiter.api.Test;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Problem3Test {

    private Function<String, Integer> solvation = Problem3::test;

    @Test
    void solvation_succeed() {

        assertEquals(1994, solvation.apply("MCMXCIV"));
        assertEquals(58, solvation.apply("LVIII"));
    }



    /*@Test
    void solvation_with_positive_failed() {

        assertFalse(solvation.test(234));
    }

    @Test
    void solvation_with_negative_failed() {

        assertFalse(solvation.test(-121));
    }*/
}
