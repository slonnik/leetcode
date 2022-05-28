package tinkoff.test2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem2Test {

    @Test
   void positiveTest() {
       assertEquals(6, new Problem2().sum(new int[]{2,3,4}));
   }
}
