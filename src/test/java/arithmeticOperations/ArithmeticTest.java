package arithmeticOperations;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void testCalculate() {
        System.setOut(new PrintStream(outContent));
        Arithmetic.calculate((byte) 3, (short) 5, 7, 8.0, 0.7f);
        String[] str = outContent.toString().split("\n");
        assertEquals("8", str[0]);
        assertEquals("7.300000011920929", str[1]);
        assertEquals("21", str[2]);
        assertEquals("1", str[3]);
    }
}