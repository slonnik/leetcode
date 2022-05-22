package org.example.case2;

import org.junit.jupiter.api.Test;

import java.util.function.IntPredicate;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Problem2Test {

    private IntPredicate solvation = Problem2::test2;

    @Test
    void solvation_succeed() {

        assertTrue(solvation.test(1073773701));
    }

    @Test
    void solvation_with_positive_failed() {

        assertFalse(solvation.test(234));
    }

    @Test
    void solvation_with_negative_failed() {

        assertFalse(solvation.test(-121));
    }
}
