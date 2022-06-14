package yandex.case2;

import org.junit.jupiter.api.Test;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem2Test {

    @Test
    public void testPositive1() throws Exception{
        var byteArrayOutputStream = new ByteArrayOutputStream();
        var printStream = new PrintStream(byteArrayOutputStream);
        System.setIn( new ByteArrayInputStream("5\n1\n0\n1\n0\n1\n".getBytes()));
        System.setOut(printStream);
        Problem2.main(new String[]{});
        assertEquals(1, Integer.valueOf(new String(byteArrayOutputStream.toByteArray())));
    }

    @Test
    public void testPositive2() throws Exception{
        var byteArrayOutputStream = new ByteArrayOutputStream();
        var printStream = new PrintStream(byteArrayOutputStream);
        System.setIn( new ByteArrayInputStream("7\n1\n0\n1\n1\n1\n0\n1\n".getBytes()));
        System.setOut(printStream);
        Problem2.main(new String[]{});
        assertEquals(3, Integer.valueOf(new String(byteArrayOutputStream.toByteArray())));
    }

    @Test
    public void testPositive3() throws Exception{
        var byteArrayOutputStream = new ByteArrayOutputStream();
        var printStream = new PrintStream(byteArrayOutputStream);
        System.setIn( new ByteArrayInputStream("2\n1\n1".getBytes()));
        System.setOut(printStream);
        Problem2.main(new String[]{});
        assertEquals(2, Integer.valueOf(new String(byteArrayOutputStream.toByteArray())));
    }
}
