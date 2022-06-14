package yandex.case1;


import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem1Test {



    @Test
    void testPositive2() throws Exception {
        var byteArrayOutputStream = new ByteArrayOutputStream();
        var printStream = new PrintStream(byteArrayOutputStream);
        System.setIn( new ByteArrayInputStream("ab\n aabbccdd".getBytes()));
        System.setOut(printStream);
        Problem1.main(new String[]{});
        assertEquals(4, Integer.valueOf(new String(byteArrayOutputStream.toByteArray())));
    }
}
