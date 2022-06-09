package org.example.case11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem11Test {

    @Test
    void testPositive1(){
        assertEquals(6, new Problem11().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

    @Test
    void testPositive2(){
        assertEquals(-1, new Problem11().maxSubArray(new int[]{-1}));
    }

    @Test
    void testPositive3(){
        assertEquals(23, new Problem11().maxSubArray(new int[]{5,4,-1,7,8}));
    }
}
